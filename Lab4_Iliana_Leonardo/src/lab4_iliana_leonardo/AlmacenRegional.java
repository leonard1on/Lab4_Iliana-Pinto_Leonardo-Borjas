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
public class AlmacenRegional extends Almacenes{

    private String departamento;

    public AlmacenRegional(String departamento, Producto p, double tamaño, double altura) {
        super(p, tamaño, altura);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "AlmacenRegional{" + "departamento=" + departamento + '}';
    }
    
    
    
    
    
}