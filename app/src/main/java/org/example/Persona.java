package org.example;

public class Persona {
    private String nombre;
    private Integer dni;

    
    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Integer getDni() {
        return dni;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "Documento: " + dni;
    }
    
}
