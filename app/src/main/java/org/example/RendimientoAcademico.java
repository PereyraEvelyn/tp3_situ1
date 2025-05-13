package org.example;
import java.util.ArrayList;
import java.util.List;

public class RendimientoAcademico {
    private List<Calificacion> calificaciones;
    
    public RendimientoAcademico{
        this.calificaciones = new ArrayList();
    }

   public void agregarCalificacion(Calificacion calificacion){
    calificaciones.add(calificacion);
    }

    public List<Calificacion> obtenerCalificaionesPorInscripcion(Inscripcion inscripcion){
    List<Calificacion> resultado = new ArrayList();
    for (Calificacion calificacion: calificaciones){
        if(calificacion.getInscripcion().equals(inscripcion)){
            resultado.add(calificacion);
        } 
    }
    return resultado;
    }

    public double CalcularPromedioFinal(Inscripcion inscripcion){
        List<Calificacion> calificacionesInsc = obtenerCalificaionesPorInscripcion(inscripcion);
        if(calificacionesInsc.isEmpty()){
            return 0.0;
        }
        double suma = 0.0;
    }






}