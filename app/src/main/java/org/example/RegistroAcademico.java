import java.util.ArrayList;
import java.util.List;


public class RegistroAcademico {
    private List<Inscripcion> inscripciones;

    public RegistroAcademico{
        this.inscripciones = new ArrayList();
    }

   public void agregarInscripcion(Inscripcion inscripcion){
    inscripciones.add(inscripcion);
    }

    public List<Inscripcion> obtenerInscripcionesPorCurso(Curso curso){
    List<Inscripcion> resultado = new ArrayList();
    for (Inscripcion inscripcion: inscripciones){
        if(inscripcion.getCurso().equals(curso) && inscripcion.isActiva()){
            resultado.add(inscripcion);
        } 
    }
    return resultado;
    }

    public List<Alumno> obtenerAlumnos (Curso curso){
        List<Alumno> alumnos = new ArrayList<>();
        for(Inscripcion ins: inscripciones){
            if(ins.getCurso().equals(curso) && ins.isActiva()){
                alumnos.add(ins.getAlumno());
            }
        }
        return alumnos;
    }

    public List<Curso> ObtenerCursosDeAlumno(Alumno alumno){
         List<Curso> cursos = new ArrayList<>();
        for(Inscripcion ins: inscripciones){
            if(ins.getAlumno().equals(alumno) && ins.isActiva()){
                cursos.add(ins.getCurso());
            }
        }
        return cursos;
    }

    public Inscripcion BuscarInscripcion(Alumno alumno, Curso curso){
        for(Inscripcion inscripcion: inscripciones){
            if(inscripcion.correspondeA(Alumno, curso) && inscripcion.isActiva()){
                return inscripcion;
            }
        }
        return null; //No se encontro la inscripcion
    }


}