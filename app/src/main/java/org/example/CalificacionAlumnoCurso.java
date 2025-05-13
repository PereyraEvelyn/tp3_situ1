package org.example;
import java.util.ArrayList;
import java.util.List;

public class CalificacionAlumnoCurso {
    private Persona alumno;
    private List<Calificacion> calificaciones;

    public CalificacionAlumnoCurso(Persona alumno) {
        this.alumno = alumno;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(Calificacion nota){
        calificaciones.add(nota);
        System.out.println("Alumno: " + alumno.getNombre() + "  Nota agregada");
    }

    public void imprimirNotas(){
        System.out.println("Notas del Alumno: " +alumno.getNombre() );
        for(Calificacion nota: calificaciones){
            System.out.println(nota);
        }

    }

    public String getAlumno(){
        return alumno.getNombre();
    }

    
}
