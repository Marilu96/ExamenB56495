/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador_FRM_VentanaBiblioteca;

/**
 *
 * @author Usuario
 */
public class PanelBotones extends javax.swing.JPanel {

    /**
     * Creates new form PanelBotones
     */
    public PanelBotones() {
        initComponents();
    }
    
    public void agregarEventos(Controlador_FRM_VentanaBiblioteca controlador)
    {
        this.btnBuscar.addActionListener(controlador);
        this.btnAgregar.addActionListener(controlador);
        this.btnModificar.addActionListener(controlador);
        this.btnEliminar.addActionListener(controlador);
    }
    
    public void inicializarGUI()
    {
        this.btnBuscar.setEnabled(true);
        this.btnAgregar.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
    }
    
    public void habilitarAgregar()
    {
        this.btnBuscar.setEnabled(false);
        this.btnAgregar.setEnabled(true);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
    }
    
    public void habilitarEdicion()
    {
        this.btnBuscar.setEnabled(false);
        this.btnAgregar.setEnabled(false);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnBuscar)
                .addComponent(btnAgregar)
                .addComponent(btnModificar)
                .addComponent(btnEliminar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    // End of variables declaration//GEN-END:variables
}
