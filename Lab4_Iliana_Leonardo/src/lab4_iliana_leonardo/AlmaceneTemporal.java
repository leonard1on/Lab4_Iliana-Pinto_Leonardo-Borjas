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
public class AlmaceneTemporal extends Almacenes{
    ArrayList <Cliente> c = new ArrayList();
    ArrayList <Producto> pro = new ArrayList();
    ArrayList <Empleado> e = new ArrayList();
    public AlmaceneTemporal(Producto p, double tamaño, double altura) {
        super(p, tamaño, altura);
    }

    public ArrayList<Cliente> getC() {
        return c;
    }

    public void setC(ArrayList<Cliente> c) {
        this.c = c;
    }

    public ArrayList<Producto> getPro() {
        return pro;
    }
    

    public void setPro(ArrayList<Producto> pro) {
        this.pro = pro;
    }

    

    public ArrayList<Empleado> getE() {
        return e;
    }

    public void setE(ArrayList<Empleado> e) {
        this.e = e;
    }
    

    @Override
    public String[][] CifradoRiel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] CifradoTransposicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ConversionBinario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char CifradoVigenere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char Posiciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[][] EnciptacionMatrcices() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public char DeclaracionAlfabeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
