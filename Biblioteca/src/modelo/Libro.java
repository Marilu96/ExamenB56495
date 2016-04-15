/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    private String numeroPrestamo;
    private String nombreUsuario;
    private String cedulaUsuario;
    private String isbLibro;

    public Libro(String numeroPrestamo, String nombreUsuario, String cedulaUsuario, String isbLibro) {
        this.numeroPrestamo = numeroPrestamo;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.isbLibro = isbLibro;
    }

    /**
     * @return the numeroPrestamo
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * @param numeroPrestamo the numeroPrestamo to set
     */
    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the cedulaUsuario
     */
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    /**
     * @param cedulaUsuario the cedulaUsuario to set
     */
    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    /**
     * @return the isbLibro
     */
    public String getIsbLibro() {
        return isbLibro;
    }

    /**
     * @param isbLibro the isbLibro to set
     */
    public void setIsbLibro(String isbLibro) {
        this.isbLibro = isbLibro;
    }
    
}
