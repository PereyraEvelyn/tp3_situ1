package org.example;

public abstract class Persona implements Comparable<Persona> {
    protected String numeroDocumento;
    protected String nombre;
    protected String apellido;

    public Persona(String numeroDocumento, String nombre, String apellido) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

   @Override
    public int compareTo(Persona otra) {
        int resultadoApellido = this.apellido.compareTo(otra.getApellido());
        if (resultadoApellido == 0) {
            return this.nombre.compareTo(otra.getNombre());
        }
        return resultadoApellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombreCompleto() + " (DNI: " + numeroDocumento + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        return numeroDocumento.equals(other.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return numeroDocumento.hashCode();
    }


}