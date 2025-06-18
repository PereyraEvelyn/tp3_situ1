package org.example;

public class Asistente extends Persona {
    private String codigoAsistente;

    public Asistente(String numeroDocumento, String nombre, String codigoAsistente) {
        super(numeroDocumento, nombre);
        this.codigoAsistente = codigoAsistente;
    }

    public String getCodigoAsistente() {
        return codigoAsistente;
    }

    @Override
    public String toString() {
        return "Asistente: " + nombre + " (Código: " + codigoAsistente + ", DNI: " + numeroDocumento + ")";
    }
}

