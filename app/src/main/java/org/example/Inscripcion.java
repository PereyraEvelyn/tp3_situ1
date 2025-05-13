package org.example;

import java.time.LocalDate;
import org.auxiliares.FormatoFecha;

public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    private boolean activa;
    private LocalDate fechaInscripcion;

    public Inscripcion(Alumno alumno, Curso curso, String fechaInscripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.activa = true;
        this.fechaInscripcion = FormatoFecha.convertirAFecha(fechaInscripcion);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getFechaInscripcion(){
        return fechaInscripcion;
    }

    public boolean isActiva(){
        return activa;
    }

    public void darDeBaja(){
        this.activa=false;
    }

    public boolean correspondeA(Alumno alumno, Curso curso){
        return this.alumno.equals(alumno) && this.curso.equals(curso);
    }
}
