package org.example;

public abstract class Persona {
    protected String numeroDocumento;
    protected String nombre;

    public Persona(String numeroDocumento, String nombre) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " (DNI: " + numeroDocumento + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        return numeroDocumento.equals(other.numeroDocumento);
    }

}