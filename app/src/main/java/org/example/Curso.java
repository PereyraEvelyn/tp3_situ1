package org.example;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Curso {
    private String nombre;
    private String horario;
    private int capacidadMaxima;
    private Profesor profesorACargo;
    private Asistente asistente;
    private Set<Inscripcion> inscripciones; // Reemplazi List por Set

    public Curso(String nombre, String horario, int capacidadMaxima) {
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
        this.inscripciones = new TreeSet<>(); 
        this.profesorACargo = null;
        this.asistente = null;
    }

    public void asignarProfesor(Profesor profesor) { 
        this.profesorACargo = profesor; 
    }
    public void asignarAsistente(Asistente asistente) { 
        this.asistente = asistente; 
    }

    public void inscribirPersona(Persona persona) throws InscripcionException {
        if (inscripciones.size() >= capacidadMaxima) {
            throw new CursoCompletoException("El curso '" + nombre + "' ha alcanzado su capacidad maxima.");
        }
        if (persona.equals(this.profesorACargo) || persona.equals(this.asistente)) {
            throw new ConflictoRolException(persona.getNombreCompleto() + " no puede inscribirse en un curso donde tiene un rol asignado.");
        }

        String codInscripcion = "INS-" + this.nombre.charAt(0) + "-" + (inscripciones.size() + 1);
        Inscripcion nuevaInscripcion = new Inscripcion(codInscripcion, persona, this);

        if (!inscripciones.add(nuevaInscripcion)) {
            throw new PersonaYaInscritaException(persona.getNombreCompleto() + " ya esta inscrito en este curso.");
        }
        
        System.out.println("Inscripcion exitosa: " + persona.getNombreCompleto() + " al curso '" + nombre + "'.");
    }

    public void imprimirResumen() {
        System.out.println("\n--- Resumen del Curso: " + nombre + " ---");
        System.out.println("Horario: " + horario);
        if (profesorACargo != null) {
            System.out.println("Profesor a cargo: " + profesorACargo.getNombreCompleto());
        }
        if (asistente != null) {
            System.out.println("Asistente del curso: " + asistente.getNombreCompleto());
        }
        System.out.println("Capacidad: " + inscripciones.size() + "/" + capacidadMaxima);
        System.out.println("\nAlumnos inscritos (Ordenados por Apellido y Nombre):");

       
        Iterator<Inscripcion> it = inscripciones.iterator(); // Uso de Iterator para recorrer la colección
        if (!it.hasNext()) {
            System.out.println("(No hay alumnos inscritos)");
        } else {
            while (it.hasNext()) {
                Inscripcion inscripcion = it.next();
                Persona p = inscripcion.getPersona();
                String rol = p.getClass().getSimpleName();
                System.out.println("- " + p.getNombreCompleto() + " (DNI: " + p.getNumeroDocumento() + ") - Rol: " + rol);
            }
        }
        System.out.println("---------------------------------------\n");
    }
    
    @Override
    public int hashCode() {
       return nombre.hashCode();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso c = (Curso) o;
        return nombre.equals(c.nombre);
    }
}