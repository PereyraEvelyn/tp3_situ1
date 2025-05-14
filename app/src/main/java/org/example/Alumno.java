package org.example;
import java.util.Objects;

public class Alumno {
    private String numeroDocumento;
    private String nombre;

    public Alumno(String numeroDocumento, String nombre) {
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
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } 
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Alumno alumno = (Alumno) obj;
        return numeroDocumento.equals(alumno.numeroDocumento);
    }

}