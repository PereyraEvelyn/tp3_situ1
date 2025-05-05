# TRABAJO PRACTICO N3

## Situación 1: Sistema de Gestión Educativa
Sistema de gestión para una institución educativa que permita administrar la información relacionada con los cursos, los alumnos y los profesores:

Gestión de Cursos: Registrar información básica de cada curso (nombre, horario, capacidad máxima) y asignarle un profesor responsable.
Mantener un registro de los alumnos, identificados por su dni
Gestión de Profesores: identificados por su número de legajo.
Inscripción de Alumnos en Cursos: Permitir a los alumnos inscribirse en los cursos, validando que no excedan la capacidad máxima y que no estén ya inscritos en el mismo curso.
Permitir registrar y actualizar la calificación de los alumnos para cada curso en el que están inscritos.
Generación de Resúmenes de Curso: Proporcionar una visión general de cada curso, incluyendo el profesor, el horario, la cantidad de alumnos inscritos y la lista de alumnos con su número de documento.

## Breve Explicación del Diseño de las Clases y sus Interacciones:

El diseño del sistema se basa en cuatro clases principales que representan las entidades del dominio: Curso, Alumno, Profesor e Inscripcion.

Curso: Representa un curso ofrecido por la institución. Tiene atributos como nombre, horario y capacidadMaxima. Su principal responsabilidad es gestionar la inscripción de alumnos (inscribirAlumno), verificar si un alumno está inscrito (estaInscrito), actualizar la calificación de un alumno en el curso (actualizarCalificacion) y generar un resumen de la información del curso y sus alumnos inscritos (imprimirResumen). Mantiene una lista de objetos Inscripcion para rastrear a los alumnos inscritos. Tiene una relación de asociación con Profesor (un profesor dicta un curso).

Alumno: Representa a un estudiante. Tiene atributos como dni (identificador único) y nombre. Su responsabilidad principal es almacenar la información del alumno. Los métodos equals() y hashCode() están sobrescritos para permitir la comparación de alumnos basada en su dni, lo cual es crucial para verificar inscripciones duplicadas.

Profesor: Representa a un miembro del profesorado. Tiene atributos como numeroLegajo (identificador único) y nombre. Su responsabilidad principal es almacenar la información del profesor. Tiene una relación de asociación con Curso (un profesor puede dictar múltiples cursos).

Inscripcion: Representa la relación entre un Alumno y un Curso. Actúa como una clase asociativa para almacenar información específica de la inscripción, como la calificacion del alumno en ese curso. Cada objeto Inscripcion vincula un Alumno con un Curso.

Interacciones entre las Clases:

Un objeto Curso mantiene una colección de objetos Inscripcion, lo que le permite saber qué alumnos están inscritos en él y sus calificaciones.
La inscripción de un Alumno en un Curso resulta en la creación de un nuevo objeto Inscripcion que vincula a ese Alumno y ese Curso.
La clase Curso interactúa con la clase Alumno para verificar si un alumno ya está inscrito antes de permitir una nueva inscripción. Utiliza el método equals() de la clase Alumno para esta verificación.
La actualización de la calificación de un alumno en un curso implica buscar la instancia de Inscripcion correspondiente y modificar su atributo calificacion.
Al generar el resumen del curso, la clase Curso itera a través de su colección de Inscripciones para acceder a la información de los Alumnos inscritos (a través de la referencia al objeto Alumno en cada Inscripcion).
La asignación de un profesor a un curso se realiza mediante una relación de asociación unidireccional desde Curso hacia Profesor.
El uso de una clase Inscripcion para la relación muchos-a-muchos entre Alumno y Curso permite almacenar información adicional sobre la relación (como la calificación).