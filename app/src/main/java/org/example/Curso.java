package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String horario;
    private int capacidadMaxima;
    private RegistroParticipantes participantes;
    private List<CalificacionAlumnoCurso> registroNotas;

   

    public Curso(String nombre, String horario, int capacidadMaxima, RegistroParticipantes participantes) {
        this.nombre = nombre;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
        this.participantes = participantes;
        this.registroNotas = new ArrayList<>();
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


    public void asignarCalificacion(Alumno alumno, Calificacion calificacion){
        for(CalificacionAlumnoCurso registro: registroNotas){
            registro.agregarCalificacion(calificacion);
        }
    }
  
    //Generar un resumen del curso
    public void imprimirResumen() {
        System.out.println("\n--- Resumen del Curso: " + nombre + " ---");
        System.out.println("Horario: " + horario);
        System.out.println("Cantidad de alumnos inscritos: " + participantes.getCantidadParticipantes());
        if (!inscripciones.isEmpty()) {
            System.out.println("\nAlumnos inscritos:");
            
        } else {
            System.out.println("No hay alumnos inscritos en este curso.");
        }
        System.out.println("---------------------------------------\n");
    }
}