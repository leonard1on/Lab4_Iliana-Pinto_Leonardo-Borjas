/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

/**
 *
 * @author Leonardo Borjas
 */
public class Empleado extends Persona{
    private double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(nombre, id, edad, altura, peso, residencia);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}