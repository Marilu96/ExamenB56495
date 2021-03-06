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
public class FRM_VentanaBiblioteca extends javax.swing.JFrame {

    Controlador_FRM_VentanaBiblioteca controlador;
    public FRM_VentanaBiblioteca() {
        initComponents();
        controlador= new Controlador_FRM_VentanaBiblioteca(this);
        agregarEventosBotones();
        agregarEventosInformacion();
       devolverNumeroPrestamo();
       inicializarGUI();
    }
    
    public void agregarEventosBotones()
    {
        this.panelBotones1.agregarEventos(controlador);
    }
    
    public void agregarEventosInformacion()
    {
        this.panelInformacionLibro1.agregarEventos(controlador);
    }
    
    public void inicializarGUI()
    {
        this.panelBotones1.inicializarGUI();
        this.panelInformacionLibro1.inicializarGUI();
    }
    
    public void habilitarAgregar()
    {
        this.panelBotones1.habilitarAgregar();
        this.panelInformacionLibro1.habilitarEdicion();
    }
    
    public void limpiarGUI()
    {
        this.panelInformacionLibro1.limpiarGUI();
    }
    
    public String[] devolverInformacion()
    {
        return this.panelInformacionLibro1.devolverInformacion();
    }
    
    public String devolverNumeroPrestamo()
    {
        return this.panelInformacionLibro1.devolverNumeroPrestamo();
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.panelInformacionLibro1.mostrarInformacion(arreglo);
    }
    
    public void habilitarEdicion()
    {
        this.panelInformacionLibro1.habilitarEdicion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInformacionLibro1 = new vista.PanelInformacionLibro();
        panelBotones1 = new vista.PanelBotones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(panelInformacionLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInformacionLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_VentanaBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.PanelBotones panelBotones1;
    private vista.PanelInformacionLibro panelInformacionLibro1;
    // End of variables declaration//GEN-END:variables
}
