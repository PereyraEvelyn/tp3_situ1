package org.example;
import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nombre;
    private String horario;
    private int capacidadMaxima;
    private Profesor profesorACargo;
    private Asistente asistente; 
    private List<Inscripcion> inscripciones;

    public Curso(String nombre, String horario, int capacidadMaxima) {
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
        this.inscripciones = new ArrayList<>();
        this.profesorACargo = null; 
        this.asistente = null; 
    }


    public void asignarProfesor(Profesor profesor) {
        this.profesorACargo = profesor;
    }
    
    public void asignarAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    
    public boolean inscribirPersona(Persona persona) {
        if (inscripciones.size() >= capacidadMaxima) {
            System.out.println("Error de inscripcion: El curso '" + nombre + "' ha alcanzado su capacidad maxima.");
            return false;
        }
        if (estaInscrito(persona)) {
            System.out.println("Error de inscripcion: " + persona.getNombre() + " ya esta inscrito en este curso.");
            return false;
        }
        if (persona.equals(this.profesorACargo)) {
            System.out.println("Error de inscripcion: " + persona.getNombre() + " no puede inscribirse como alumno en un curso que dicta.");
            return false;
        }
        if (persona.equals(this.asistente)) {
             System.out.println("Error de inscripcion: " + persona.getNombre() + " no puede inscribirse como alumno en un curso donde es asistente.");
            return false;
        }


        String codInscripcion = "INS-" + this.nombre.charAt(0) + "-" + (inscripciones.size() + 1);
        Inscripcion nuevaInscripcion = new Inscripcion(codInscripcion, persona, this);
        inscripciones.add(nuevaInscripcion);
        System.out.println("Inscripcion exitosa: " + persona.getNombre() + " ahora es alumno del curso '" + nombre + "'.");
        return true;
    }

    public boolean estaInscrito(Persona persona) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getPersona().equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public boolean actualizarCalificacion(Persona persona, double calificacion) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getPersona().equals(persona)) {
                inscripcion.setCalificacion(calificacion);
                System.out.println("Calificacion de " + persona.getNombre() + " en '" + nombre + "' actualizada a " + calificacion);
                return true;
            }
        }
        System.out.println("El participante " + persona.getNombre() + " no esta inscrito en este curso.");
        return false;
    }
    
   
    public String getNombre() { 
        return nombre;
     }
    public Profesor getProfesorACargo() {
         return profesorACargo; 
        }
    public Asistente getAsistente() { 
        return asistente; 
    }
    public List<Inscripcion> getInscripciones() {
         return new ArrayList<>(inscripciones);
    }

    public void imprimirResumen() {
        System.out.println("\n--- Resumen del Curso: " + nombre + " ---");
        System.out.println("Horario: " + horario);
        if (profesorACargo != null) {
            System.out.println("Profesor a cargo: " + profesorACargo.getNombre());
        }
        if (asistente != null) {
            System.out.println("Asistente del curso: " + asistente.getNombre());
        }
        System.out.println("Capacidad: " + inscripciones.size() + "/" + capacidadMaxima);
        System.out.println("\nAlumnos inscritos:");
        if (inscripciones.isEmpty()) {
            System.out.println("(No hay alumnos inscritos)");
        } else {
            for (Inscripcion inscripcion : inscripciones) {
                Persona p = inscripcion.getPersona();
                String rol = p.getClass().getSimpleName(); 
                System.out.println("- " + p.getNombre() + " (DNI: " + p.getNumeroDocumento() + ") - Rol: " + rol);
            }
        }
        System.out.println("---------------------------------------\n");
    }
}