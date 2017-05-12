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
public class AlmacenPlanta extends Almacenes{
    
    private int numeroPlanta;

    public AlmacenPlanta(int numeroPlanta, Producto p, double tamaño, double altura) {
        super(p, tamaño, altura);
        this.numeroPlanta = numeroPlanta;
    }
    
    

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    @Override
    public String toString() {
        return super.toString()+"AlmacenPlanta{" + "numeroPlanta=" + numeroPlanta + '}';
    }

    @Override
    /*public String[][] CifradoRiel(String clave) {
        
        
    }*/

    //@Override
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

    @Override
    public String[][] CifradoRiel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
