# TRABAJO PRACTICO N°5
## Situación 1: Sistema de Gestión Educativa
Sistema de gestión para una institución educativa que permita administrar la información relacionada con los cursos, los alumnos y los profesores:

## Cambios
### Interfaces Comparable y Comparator:
Se implementó la interfaz Comparable en la clase Persona y se diseñó la implementación de Comparator para Inscripcion.

Comparable establece un orden natural para todos los objetos Persona (y por herencia, para Alumno, Profesor, etc.), permitiendo que las colecciones ordenadas, como TreeSet, los gestionen automáticamente.

Comparator proporciona la flexibilidad de definir criterios de ordenamiento alternativos y dinámicos.

### Clases de Excepción Personalizadas:

Agregado: Se creó una jerarquía de excepciones (InscripcionException, CursoCompletoException, etc.).
En lugar de gestionar errores mediante mensajes en la consola, el sistema ahora utiliza un mecanismo de excepciones. 


### Uso de Iterator:
Se cambio el método imprimirResumen de la clase Curso para recorrer la colección de inscripciones utilizando la interfaz Iterator.

Justificación del Reemplazo de la Colección (List por Set)
Fortaleza: Una List mantiene el orden de inserción de los elementos pero
permite elementos duplicados. Esto nos obligaba a implementar el método estaInscrito para recorrer la lista y verificar manualmente si un alumno ya estaba inscrito antes de agregarlo, lo que es ineficiente.
Implementación Nueva (TreeSet):
El método add() del Set automáticamente previene la inserción de un elemento duplicado. 
 Un TreeSet es una implementación de SortedSet, lo que significa que mantiene los elementos permanentemente ordenados. nuestro TreeSet de inscripciones siempre estará ordenado alfabéticamente por el nombre del inscripto sin necesidad de realizar una ordenación manual antes de mostrar los datos.