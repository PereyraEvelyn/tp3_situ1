package org.example;

public class Inscripcion implements Comparable<Inscripcion> {
    private String codigoInscripcion;
    private Persona persona;
    private Curso curso;
    private double calificacion;

    public Inscripcion(String codIns, Persona persona, Curso curso) {
        this.codigoInscripcion = codIns;
        this.persona = persona;
        this.curso = curso;
        this.calificacion = 0;
    }
    
    

    public void setCalificacion(double calificacion) { 
        this.calificacion = calificacion;
     }
    
     public String getCodigoInscripcion() {
        return codigoInscripcion;
    }


    public Persona getPersona() {
        return persona;
    }


    public Curso getCurso() {
        return curso;
     }


    public double getCalificacion() {
        return calificacion;
    }


 
    @Override
    public int compareTo(Inscripcion otra) {
        return this.getPersona().compareTo(otra.getPersona());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inscripcion that = (Inscripcion) obj;
        return persona.equals(that.persona) && curso.equals(that.curso);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(persona, curso);
    }
}