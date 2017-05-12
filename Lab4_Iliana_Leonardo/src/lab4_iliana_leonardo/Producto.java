/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.Date;

/**
 *
 * @author iliana
 */
public class Producto {
    private String vidaUtil;
    private Date fecha;
    private double precio;
    private int tamaño;
    private String descripcion;
    private String nombre;
    private int numero;

    public Producto(String vidaUtil, Date fecha, double precio, int tamaño, String descripcion, String nombre, int numero) {
        this.vidaUtil = vidaUtil;
        this.fecha = fecha;
        this.precio = precio;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(String vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Producto{" + "vidaUtil=" + vidaUtil + ", fecha=" + fecha + ", precio=" + precio + ", tama\u00f1o=" + tamaño + ", descripcion=" + descripcion + ", nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
            
}
