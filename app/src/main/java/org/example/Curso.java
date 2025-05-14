package org.example;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String horario;
    private int capacidadMaxima;
    private Profesor profesorACargo;
    private List<Inscripcion> inscripciones;

    public Curso(String nombre, String horario, int capacidadMaxima) {
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
        this.inscripciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Profesor getProfesorACargo() {
        return profesorACargo;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesorACargo = profesor;
    }

    public List<Inscripcion> getInscripciones() {
        return new ArrayList<>(inscripciones); 
    }

    public boolean inscribirAlumno(Alumno alumno) {
        if (inscripciones.size() < capacidadMaxima && !estaInscrito(alumno)) {
            Inscripcion nuevaInscripcion = new Inscripcion("A123",alumno, this);
            inscripciones.add(nuevaInscripcion);
            System.out.println("Alumno " + alumno.getNombre() + " inscrito en el curso " + nombre);
            return true;
        } else if (estaInscrito(alumno)) {
            System.out.println("El alumno " + alumno.getNombre() + " ya esta inscrito en este curso.");
            return false;
        } else {
            System.out.println("El curso " + nombre + " ha alcanzado su capacidad maxima.");
            return false;
        }
    }

    public boolean estaInscrito(Alumno alumno) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getAlumno().equals(alumno)) {
                return true;
            }
        }
        return false;
    }

    public boolean actualizarCalificacion(Alumno alumno, double calificacion) {
        for (Inscripcion inscripcion : inscripciones) {
            if (inscripcion.getAlumno().equals(alumno)) {
                inscripcion.setCalificacion(calificacion);
                System.out.println("Calificacion de " + alumno.getNombre() + " en " + nombre + " actualizada a " + calificacion);
                return true;
            }
        }
        System.out.println("El alumno " + alumno.getNombre() + " no esta inscrito en este curso.");
        return false;
    }

    public void imprimirResumen() {
        System.out.println("\n--- Resumen del Curso: " + nombre + " ---");
        System.out.println("Profesor a cargo: " + profesorACargo.getNombre());
        System.out.println("Horario: " + horario);
        System.out.println("Cantidad de alumnos inscritos: " + inscripciones.size());
            System.out.println("\nAlumnos inscritos:");
            for (Inscripcion inscripcion : inscripciones) {
                System.out.println("- " + inscripcion.getAlumno().getNombre() + " (Documento: " + inscripcion.getAlumno().getNumeroDocumento() + ")");
            }
        System.out.println("---------------------------------------\n");
    }
}