package org.example;

public class Alumno implements ParticipanteCurso{
    private Persona alumno;

    public Alumno(Persona obj) {
        alumno = obj;
    }

    @Override
    public void imprimirDatos(){
        system.out.println("Alumno: "+alumno.getNombre()+ "Documento: " +alumno.getDni()+ );
    }
    

   
}