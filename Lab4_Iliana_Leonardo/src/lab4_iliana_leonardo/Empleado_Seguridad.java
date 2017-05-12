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
public class Empleado_Seguridad extends Empleado{
    private String dia;

    public Empleado_Seguridad() {
    }

    public Empleado_Seguridad(String dia, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Empleado_Seguridad{" + "dia=" + dia + '}';
    }
    
}
