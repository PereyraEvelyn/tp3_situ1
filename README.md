# TRABAJO PRACTICO N3
## Situación 1: Sistema de Gestión Educativa
Sistema de gestión para una institución educativa que permita administrar la información relacionada con los cursos, los alumnos y los profesores:

## Los nuevos requisitos son:

Permitir que cada Curso pueda tener un asistente o auxiliar.
Considerar que un Profesor pueda inscribirse como Alumno en otro curso.
Considerar que un Alumno pueda ser Asistente en otro curso.

## Cambios
¿Qué tienen en común un Profesor, un Alumno y un Asistente? Son todos Personas. Todos comparten atributos esenciales como un nombre y un número de documento/identificador.

### Clase Abstracta Persona: Se crea para eliminar la duplicación de código y establecer un tipo común, .

### Clase Asistente: Se crea esta nueva clase para representar el nuevo rol. Heredará de Persona para poder reutilizar los atributos y comportamientos comunes.

### Modificación en Curso: La clase Curso ahora tiene una nueva asociación para incorporar al Asistente.

### Modificación en Inscripcion: Para permitir que cualquiera que sea una Persona pueda inscribirse, la clase Inscripcion ya no se asocia directamente con Alumno, sino con Persona.