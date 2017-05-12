/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.Calendar;

/**
 *
 * @author Leonardo Borjas
 */
public class Empleado_Carga extends Empleado{
    private String hora_entrada;
    private String hora_salida;
    private String fecha_entrada;

    public Empleado_Carga() {
    }

    public Empleado_Carga(String hora_entrada, String hora_salida, String fecha_entrada, double sueldo, String nombre, String id, int edad, double altura, double peso, String residencia) {
        super(sueldo, nombre, id, edad, altura, peso, residencia);
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.fecha_entrada = fecha_entrada;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    @Override
    public String toString() {
        return "Empleado_Carga{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + ", fecha_entrada=" + fecha_entrada + '}';
    }
    
    
}
