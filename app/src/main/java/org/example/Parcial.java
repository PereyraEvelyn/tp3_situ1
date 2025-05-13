package org.example;

public class Parcial extends TipoEvaluacion {
    public Parcial(String titulo){
        super(titulo);
    }
    
    @Override
    public String descripcion(){
        return "Examen parcial sobre el contenido del curso";
    }
}
