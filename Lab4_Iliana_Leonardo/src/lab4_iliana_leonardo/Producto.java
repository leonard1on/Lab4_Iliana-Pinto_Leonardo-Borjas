/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

/**
 *
 * @author iliana
 */
public class Producto {

    private int vidaUtil;
    private String fecha;
    private double precio;
    private int tamaño;
    private String descripcion;
    private String nombre;
    private int numero;

    public Producto() {
    }

    public Producto(int vidaUtil, String fecha, double precio, int tamaño, String descripcion, String nombre, int numero) {
        this.vidaUtil = vidaUtil;
        this.fecha = fecha;
        this.precio = precio;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.numero = numero;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
