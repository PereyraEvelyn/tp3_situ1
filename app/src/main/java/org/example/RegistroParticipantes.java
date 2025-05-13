package org.example;
import java.util.ArrayList;
import java.util.List;

public class RegistroParticipantes {
    private List<ParticipanteCurso> participantes;

    public RegistroParticipantes() {
        this.participantes = new ArrayList<>();
    }

    public boolean VerificarAlumnoInscrito(ParticipanteCurso participante) {
        for () {
            if ()) {
                return true;
            }
        }
        return false;
    }

    public void agregarParticipante(ParticipanteCurso participante){
        participantes.add(participante);
         if(participante instanceof Alumno){
           Alumno rolAlumno = (Alumno) participante;
           registroNotas.add(new CalificacionAlumnoCurso(rolAlumno.getNombre));
         }         
    }

    public void mostrarParticipantes(){
        System.out.println("Curso: " + nombre + " Horario: " + horario);
        System.out.println("Inscriptos:");
        for(ParticipanteCurso participante: participantes){
            participante.imprimirDatos();
        }
    }

    public int getCantidadParticipantes(){
        return participantes.size();
    }
}