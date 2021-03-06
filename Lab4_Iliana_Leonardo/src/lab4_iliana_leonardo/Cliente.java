/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Cliente extends Persona{
    private double dinero;
    private String primercompra;
    private ArrayList<Producto> producto = new ArrayList();

    public Cliente() {
    }

    
    public Cliente(double dinero, String primercompra, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(nombre, id, edad, altura, peso, residencia);
        this.dinero = dinero;
        this.primercompra = primercompra;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getPrimercompra() {
        return primercompra;
    }

    public void setPrimercompra(String primercompra) {
        this.primercompra = primercompra;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dinero=" + dinero + ", primercompra=" + primercompra + ", producto=" + producto + '}';
    }
    
    
}
