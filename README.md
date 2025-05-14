# TRABAJO PRACTICO N3

## Situación 1: Sistema de Gestión Educativa
Sistema de gestión para una institución educativa que permita administrar la información relacionada con los cursos, los alumnos y los profesores:

Gestión de Cursos: Registrar información básica de cada curso (nombre, horario, capacidad máxima) y asignarle un profesor responsable.
Mantener un registro de los alumnos, identificados por su dni
Gestión de Profesores: identificados por su número de legajo.
Inscripción de Alumnos en Cursos: Permitir a los alumnos inscribirse en los cursos, validando que no excedan la capacidad máxima y que no estén ya inscritos en el mismo curso.
Permitir registrar y actualizar la calificación de los alumnos para cada curso en el que están inscritos.
Resúmen de Curso: Mostrar una visión general de cada curso, incluyendo el profesor, el horario, la cantidad de alumnos inscritos y la lista de alumnos con su número de documento.

## Diseño de las Clases y sus Interacciones:

Hay cuatro clases principales que representan las entidades del dominio: Curso, Alumno, Profesor e Inscripcion.

Curso: Representa un curso ofrecido por la institución. Tiene atributos como nombre, horario y capacidadMaxima. Su principal responsabilidad es gestionar la inscripción de alumnos (inscribirAlumno), verificar si un alumno está inscrito (estaInscrito), actualizar la calificación de un alumno en el curso (actualizarCalificacion) y generar un resumen de la información del curso y sus alumnos inscritos (imprimirResumen). Mantiene una lista de objetos Inscripcion para los alumnos inscritos. Tiene una relación de asociación con Profesor (un profesor dicta un curso).

Alumno: Representa a un estudiante. Tiene atributos como dni (identificador único) y nombre. Su responsabilidad es almacenar la información del alumno. El método equals() permite la comparación de alumnos basada en su dni

Profesor: Representa a un miembro del profesorado. Tiene atributos como numeroLegajo (identificador único) y nombre. Su responsabilidad principal es almacenar la información del profesor. Tiene una relación de asociación con Curso (un profesor puede dictar múltiples cursos).

Inscripcion: Representa la relación entre un Alumno y un Curso. almacena información específica de la inscripción, como la calificacion del alumno en ese curso. Cada objeto Inscripcion vincula un Alumno con un Curso.

