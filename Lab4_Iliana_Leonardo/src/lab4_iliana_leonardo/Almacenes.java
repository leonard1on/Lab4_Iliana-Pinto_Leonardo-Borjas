/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.ArrayList;

/**
 *
 * @author iliana
 */
public abstract class Almacenes {
    private Producto p;
    private double tamaño;
    private double altura;
    ArrayList <Empleado> e = new ArrayList();
    ArrayList <Cliente> c = new ArrayList();

    public Almacenes(Producto p, double tamaño, double altura) {
        this.p = p;
        this.tamaño = tamaño;
        this.altura = altura;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<Empleado> getE() {
        return e;
    }

    public void setE(ArrayList<Empleado> e) {
        this.e = e;
    }

    public ArrayList<Cliente> getC() {
        return c;
    }

    public void setC(ArrayList<Cliente> c) {
        this.c = c;
    }

    public abstract String [][] CifradoRiel();
    public abstract String [][] CifradoTransposicion();
    public abstract int ConversionBinario();
    public abstract char CifradoVigenere();
    public abstract char Posiciones();
    public abstract int [][] EnciptacionMatrcices();
    public abstract char DeclaracionAlfabeto();
    
    @Override
    public String toString() {
        return "Almacenes{" + "p=" + p + ", tama\u00f1o=" + tamaño + ", altura=" + altura + ", e=" + e + ", c=" + c + '}';
    }
    
    
    
}
