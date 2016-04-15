/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosLibro;
import vista.FRM_VentanaBiblioteca;

/**
 *
 * @author Usuario
 */
public class Controlador_FRM_VentanaBiblioteca implements ActionListener {
    
    FRM_VentanaBiblioteca frm_VentanaBiblioteca;
    MetodosLibro metodosLibro;
    public Controlador_FRM_VentanaBiblioteca(FRM_VentanaBiblioteca frm_VentanaBiblioteca)
    {
        this.frm_VentanaBiblioteca=frm_VentanaBiblioteca;
        metodosLibro= new MetodosLibro();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equalsIgnoreCase("Buscar"))
        {
           buscar();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Agregar"))
        {
            metodosLibro.agregarLibro();
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Agregado con exito!");
            frm_VentanaBiblioteca.inicializarGUI();
            frm_VentanaBiblioteca.limpiarGUI();
        }
        
        if(e.getActionCommand().equalsIgnoreCase("Modificar"))
        {
            metodosLibro.modificarLibro(frm_VentanaBiblioteca.devolverInformacion());
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Modificado con exito!");

        }
        
        if(e.getActionCommand().equalsIgnoreCase("Eliminar"))
        {
            metodosLibro.eliminarLibro(frm_VentanaBiblioteca.devolverNumeroPrestamo());
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "Eliminado con exito!");

        }
        
    }
    
    public void buscar()
    {
        if(metodosLibro.consultarLibro(frm_VentanaBiblioteca.devolverNumeroPrestamo()))
        {
            frm_VentanaBiblioteca.mostrarInformacion(metodosLibro.devolverArreglo());
            frm_VentanaBiblioteca.habilitarEdicion();
        }
        else
        {
            JOptionPane.showMessageDialog(frm_VentanaBiblioteca, "No encontrado");
            frm_VentanaBiblioteca.habilitarAgregar();

        }
    
    }
    
    
}
