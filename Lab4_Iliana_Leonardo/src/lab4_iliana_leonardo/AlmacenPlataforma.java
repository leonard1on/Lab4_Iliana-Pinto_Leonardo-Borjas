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
public class AlmacenPlataforma extends Almacenes{
    private ArrayList<Cliente> c = new ArrayList();

    public AlmacenPlataforma( Producto p, double tamaño, double altura) {
        super(p, tamaño, altura);
        
    }

    public ArrayList<Cliente> getC() {
        return c;
    }

    public void setC(ArrayList<Cliente> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "AlmacenPlataforma{" + "c=" + c + '}';
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
