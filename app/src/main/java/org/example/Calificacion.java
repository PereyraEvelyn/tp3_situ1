package org.example;

public class Calificacion {
    private double nota;
    private String observaciones;

    public Calificacion(double nota, String observaciones) {
        this.nota = nota;
        this.observaciones = observaciones;
    }

    public double getNota() {
        return nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    

    

}
