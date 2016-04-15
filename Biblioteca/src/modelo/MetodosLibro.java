/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MetodosLibro {
    
    ArrayList <Libro> listaLibro;
    String arregloInformacionConsultar[] = new String[4];
    
    
    public MetodosLibro()
    {
        listaLibro = new ArrayList<Libro>();
    }
    
    public void agregarLibro()
    {
        listaLibro.add(new Libro(arregloInformacionConsultar[0], arregloInformacionConsultar[1], arregloInformacionConsultar[2], arregloInformacionConsultar[3]));
    }
    
    public boolean consultarLibro(String numeroPrestamo)
    {
        boolean verificar=false;
        for (int i = 0; i < listaLibro.size(); i++)
        {
            if(listaLibro.get(i).getNumeroPrestamo().equalsIgnoreCase(numeroPrestamo))
            {
                arregloInformacionConsultar[0]=listaLibro.get(i).getNumeroPrestamo();
                arregloInformacionConsultar[1]=listaLibro.get(i).getNombreUsuario();
                arregloInformacionConsultar[2]=listaLibro.get(i).getCedulaUsuario();
                arregloInformacionConsultar[3]=listaLibro.get(i).getIsbLibro();
                verificar=true;
            }
                                
        }
         return verificar;
    }
    
    public String [] devolverArreglo()
    {
        return arregloInformacionConsultar;
    }
    
    public void modificarLibro(String arreglo[])
    {
        for (int i = 0; i < listaLibro.size(); i++) 
        {
            if(listaLibro.get(i).getNumeroPrestamo().equalsIgnoreCase(arreglo[0]))
            {
                listaLibro.get(i).setNumeroPrestamo(arreglo[1]);
                listaLibro.get(i).setNombreUsuario(arreglo[2]);
                listaLibro.get(i).setIsbLibro(arreglo[3]);
            }
        }
    }
    
    public void eliminarLibro(String numeroPrestamo)
    {
         for (int i = 0; i < listaLibro.size(); i++) {
            
                if(listaLibro.get(i).getNumeroPrestamo().equalsIgnoreCase(numeroPrestamo))
                {
                    listaLibro.remove(i);
                }
        }
    }
    
     public String devolverCodigo()
    {
        String codigo="0000"+this.listaLibro.size()+1;
        codigo=codigo.substring(codigo.length()-5, codigo.length());
        return codigo;
    }
    
}
