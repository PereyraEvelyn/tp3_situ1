package org.example;
public class Inscripcion {
    private String CodigoInscripcion;
    private Alumno alumno;
    private Curso curso;
    private double calificacion;

    public Inscripcion(String codIns, Alumno alumno, Curso curso) {
        this.CodigoInscripcion = codIns;
        this.alumno = alumno;
        this.curso = curso;
        this.calificacion = 0; 
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getCodigoInscripcion(){
        return CodigoInscripcion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
