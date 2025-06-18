package org.example;

public class App {

    public static void main(String[] args) {
        Profesor profAna = new Profesor("25111222", "Ana", "Gomez", "P-101");
        Profesor profJuan = new Profesor("28333444", "Juan", "Torres", "P-102");
        Alumno alumnoCarlos = new Alumno("40555666", "Carlos", "Ruiz");
        Asistente asistenteLaura = new Asistente("38777888", "Laura", "Paez", "A-201");
        
        Curso cursoProgramacion = new Curso("Programacion Avanzada", "Lunes y Miercoles 18:00 - 20:00", 3);
        cursoProgramacion.asignarProfesor(profAna);
        cursoProgramacion.asignarAsistente(asistenteLaura);

        Curso cursoBD = new Curso("Bases de Datos", "Martes y Jueves 16:00 - 18:00", 5);
        cursoBD.asignarProfesor(profJuan);

        System.out.println("=== Iniciando Inscripciones ===");
        
        // Inscripción exitosa
        inscribir(cursoProgramacion, alumnoCarlos);
        inscribir(cursoProgramacion, profJuan); // Profesor de otro curso se inscribe como alumno

        // Intento de inscripcipn duplicada
        inscribir(cursoProgramacion, alumnoCarlos);

        // Intento de inscripcion de un profesor a su propio curso
        inscribir(cursoProgramacion, profAna);
        
        // Intento de superar la capacidad del curso
        Alumno alumnoExtra = new Alumno("50111222", "Pedro", "Garcia");
        inscribir(cursoProgramacion, alumnoExtra); // Esta deberia ser exitosa
        
        Alumno otroAlumno = new Alumno("51222333", "Sofia", "Martinez");
        inscribir(cursoProgramacion, otroAlumno); // Esta debería fallar por capacidad

        cursoProgramacion.imprimirResumen();
        cursoBD.imprimirResumen();
    }

    private static void inscribir(Curso curso, Persona persona) {
        try {
            curso.inscribirPersona(persona);
        } catch (InscripcionException e) {
            System.err.println("Error de Inscripcion: " + e.getMessage() + " (Excepcion)");
        }
    }
}