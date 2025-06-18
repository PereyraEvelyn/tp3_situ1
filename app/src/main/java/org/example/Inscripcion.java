package org.example;

public class Inscripcion {
    private String CodigoInscripcion;
    private Persona persona; 
    private Curso curso;
    private double calificacion;

    public Inscripcion(String codIns, Persona persona, Curso curso) {
        this.CodigoInscripcion = codIns;
        this.persona = persona;
        this.curso = curso;
        this.calificacion = 0; 
    }

 
    public Persona getPersona() {
        return persona;
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
