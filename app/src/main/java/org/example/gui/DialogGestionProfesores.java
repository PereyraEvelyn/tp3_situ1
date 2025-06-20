/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.example.gui;

import org.example.Profesor;
import org.example.SistemaGestion;
import javax.swing.JOptionPane;

/**
 *
 * @author Evelyn
 */
public class DialogGestionProfesores extends javax.swing.JDialog {
private SistemaGestion sistema;

    /**
     * Creates new form DialogGestionProfesores
     */
   public DialogGestionProfesores(java.awt.Frame parent, boolean modal, SistemaGestion sistema) {
    super(parent, modal);
    this.sistema = sistema;
    initComponents();
    cargarProfesoresEnTabla(); // Llamamos al nuevo método
    pack();
}

   
   private void cargarProfesoresEnTabla() {
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaProfesores.getModel();
    model.setRowCount(0); // Limpiar tabla

    java.util.List<org.example.Profesor> profesores = sistema.getProfesores();

    for (org.example.Profesor profesor : profesores) {
        model.addRow(new Object[]{
            profesor.getNumeroDocumento(),
            profesor.getNombre(),
            profesor.getApellido(),
            profesor.getNumeroLegajo() // La columna extra para el profesor
        });
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorTablaProf = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        btnAgregarProfesor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dni", "Nombre", "Apellido", "Nro Legajo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        contenedorTablaProf.setViewportView(tablaProfesores);

        btnAgregarProfesor.setText("Agregar Profesor");
        btnAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorTablaProf, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarProfesor)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorTablaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProfesor)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesorActionPerformed
// Pedimos los datos del nuevo profesor
    String dni = JOptionPane.showInputDialog(this, "Ingrese el DNI del profesor:", "Nuevo Profesor", JOptionPane.QUESTION_MESSAGE);
    if (dni != null && !dni.trim().isEmpty()) {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:", "Nuevo Profesor", JOptionPane.QUESTION_MESSAGE);
        String apellido = JOptionPane.showInputDialog(this, "Ingrese el apellido:", "Nuevo Profesor", JOptionPane.QUESTION_MESSAGE);
        String legajo = JOptionPane.showInputDialog(this, "Ingrese el N° de Legajo:", "Nuevo Profesor", JOptionPane.QUESTION_MESSAGE);

        if (nombre != null && apellido != null && legajo != null) {
            Profesor nuevoProfesor = new Profesor(dni, nombre, apellido, legajo);
            this.sistema.agregarProfesor(nuevoProfesor);
            cargarProfesoresEnTabla(); // Refrescamos la tabla
            JOptionPane.showMessageDialog(this, "Profesor agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProfesorActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfesor;
    private javax.swing.JScrollPane contenedorTablaProf;
    private javax.swing.JTable tablaProfesores;
    // End of variables declaration//GEN-END:variables
}
