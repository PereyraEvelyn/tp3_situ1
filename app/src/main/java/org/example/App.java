package org.example;


public class App {
   
    public static void main(String[] args) {
        Profesor profAna = new Profesor("25111222", "Ana Gómez", "P-101");
        Profesor profJuan = new Profesor("28333444", "Juan Torres", "P-102");
        Alumno alumnoCarlos = new Alumno("40555666", "Carlos Ruiz");
        Asistente asistenteLaura = new Asistente("38777888", "Laura Paez", "A-201");

        Curso cursoProgramacion = new Curso("Programacion Avanzada", "Lunes y Miercoles 18:00 - 20:00", 5);
        cursoProgramacion.asignarProfesor(profAna);
        cursoProgramacion.asignarAsistente(asistenteLaura);

        Curso cursoBD = new Curso("Bases de Datos", "Martes y Jueves 16:00 - 18:00", 3);
        cursoBD.asignarProfesor(profJuan);
;

        cursoProgramacion.inscribirPersona(alumnoCarlos);

        cursoProgramacion.inscribirPersona(profJuan);

        cursoBD.inscribirPersona(asistenteLaura);

        cursoProgramacion.inscribirPersona(profAna);

        cursoProgramacion.inscribirPersona(asistenteLaura);

        // --- Imprimiendo Resúmenes Finales ---
        cursoProgramacion.imprimirResumen();
        cursoBD.imprimirResumen();
    }
}