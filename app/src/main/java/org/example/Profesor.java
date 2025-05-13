package org.example;
public class Profesor implements ParticipanteCurso {
    private Persona persona;
    private String numeroLegajo;

    public Profesor(String numeroLegajo, Persona persona) {
        this.numeroLegajo = numeroLegajo;
        this.persona = persona;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }


    @Override
    public void realizarActividad(String actividad){
        System.out.println("El profesor" +persona.getNombre() + " esta realizando la actividad");
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
