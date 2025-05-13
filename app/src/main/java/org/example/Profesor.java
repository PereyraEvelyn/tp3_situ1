package org.example;
public class Profesor {
    private String numeroLegajo;
    private String nombre;

    public Profesor(String numeroLegajo, String nombre) {
        this.numeroLegajo = numeroLegajo;
        this.nombre = nombre;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){ 
            return true;
        }
        if(obj == null || getClass() !=obj.getClass()){ 
            return false;
        }
        Profesor profesor = (Profesor) obj; 
        return numeroLegajo.equals(profesor.numeroLegajo); 
    }

}
