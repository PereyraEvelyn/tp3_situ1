package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {

    private List<Alumno> alumnos;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public SistemaGestion() {
        this.alumnos = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        
        cargarDatosIniciales();
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public List<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }
    
    public List<Profesor> getProfesores() {
        return this.profesores;
    }

    // --- Métodos para gestionar Cursos (aquí iría la lógica de inscribir, etc.) ---
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public List<Curso> getCursos() {
        return this.cursos;
    }
    
    private void cargarDatosIniciales() {
        this.profesores.add(new Profesor("25111222", "Ana", "Gómez", "P-101"));
        this.alumnos.add(new Alumno("40555666", "Carlos", "Ruiz"));
        this.alumnos.add(new Alumno("42888999", "Maria", "Lopez"));
    }
}