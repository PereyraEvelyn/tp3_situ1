package org.example;

import javax.swing.SwingUtilities;


public class App {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();

       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal(sistema).setVisible(true);
            }
        });
    }
}