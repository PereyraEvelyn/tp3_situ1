package org.example;

public class Profesor extends Persona {
    private String numeroLegajo;

    public Profesor(String numeroDocumento, String nombre, String numeroLegajo) {
        super(numeroDocumento, nombre);
        this.numeroLegajo = numeroLegajo;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Profesor)) return false;
        Profesor other = (Profesor) obj;
        return super.equals(other) && numeroLegajo.equals(other.numeroLegajo);
    }
    
    @Override
    public String toString() {
        return "Profesor: " + nombre + " (Legajo: " + numeroLegajo + ", DNI: " + numeroDocumento + ")";
    }
}