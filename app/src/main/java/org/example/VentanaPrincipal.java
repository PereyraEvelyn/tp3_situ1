package org.example;

import org.example.gui.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private SistemaGestion sistema;

    public VentanaPrincipal(SistemaGestion sistema) {
        this.sistema = sistema;
        
        setTitle("Sistema de Gestión Académica");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        JMenuBar menuBar = new JMenuBar();
        
        // Menú "Archivo"
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemSalir = new JMenuItem("Salir");
        itemSalir.addActionListener(e -> System.exit(0)); 
        menuArchivo.add(itemSalir);
        
        // Menú "Gestionar"
        JMenu menuGestionar = new JMenu("Gestionar");
        JMenuItem itemGestionAlumnos = new JMenuItem("Gestionar Alumnos");
        itemGestionAlumnos.addActionListener(e -> abrirDialogoAlumnos());
        
        JMenuItem itemGestionProfesores = new JMenuItem("Gestionar Profesores");
        itemGestionProfesores.addActionListener(e -> abrirDialogoProfesores());

        JMenuItem itemGestionCursos = new JMenuItem("Gestionar Cursos");
        menuGestionar.add(itemGestionAlumnos);
        menuGestionar.add(itemGestionProfesores);
        menuGestionar.add(itemGestionCursos);
        
        menuBar.add(menuArchivo);
        menuBar.add(menuGestionar);
        
        setJMenuBar(menuBar);
    }

    private void abrirDialogoAlumnos() {
        DialogGestionAlumnos dialogo = new DialogGestionAlumnos(this, true, sistema);
        dialogo.setVisible(true);
        
    }
    
    
    private void abrirDialogoProfesores() {
    DialogGestionProfesores dialogo = new DialogGestionProfesores(this, true, sistema);
    dialogo.setVisible(true);
}
    
}