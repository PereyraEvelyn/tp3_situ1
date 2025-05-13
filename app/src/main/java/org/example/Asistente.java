package org.example;

public class Asistente implements ParticipanteCurso {
    private Persona asistente;

    public Asistente(Persona asistente){
        this.asistente = asistente;
    }

    @Override
    public void imprimirDatos(){
        system.out.println("Asistente: "+ asistente.getNombre()+ "Documento: " + asistente.getDni() );
    }
}
