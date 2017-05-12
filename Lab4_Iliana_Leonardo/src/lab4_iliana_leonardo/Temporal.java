/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iliana
 */
public class Temporal {

    static Scanner sc = new Scanner(System.in);

    public void metodo() {
        System.out.println("Ingrese el tamaño en metros");
        double tamaño = sc.nextInt();
        System.out.println("Ingrese la altura");
        double altura = sc.nextInt();
        int opcion2 = sc.nextInt();
        switch (opcion2) {
            case 1:
                System.out.println("Ingrese numero de planta:");
                int numeroPlanta = sc.nextInt();
                break;
            case 2:
                System.out.println("Ingrese departamento:");
                sc.nextLine();
                String departamento = sc.nextLine();
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
        }
    }

    public static ArrayList<Producto> modproducto(ArrayList<Producto> productos) {
        for (Producto p : productos) {
            System.out.println(productos.indexOf(p) + " " + p);
        }
        System.out.println("Cual producto desea modificar?");
        int espacio = sc.nextInt();
        if (espacio < productos.size()) {
            System.out.println("Cual es la fecha de emision?");
            String fechaemision = sc.next();
            System.out.println("Cual es la vida util?");
            int vidautil = sc.nextInt();
            System.out.println("Cual es el precio?");
            double precio = sc.nextDouble();
            System.out.println("Cual es el tamano?");
            int tamano = sc.nextInt();
            System.out.println("Cual es la descripcion?");
            String descripcion = sc.next();
            System.out.println("Cual es el nombre?");
            String nombre = sc.next();
            System.out.println("Numero de producto?");
            int numero = sc.nextInt();

            productos.get(espacio).setFecha(fechaemision);
            productos.get(espacio).setVidaUtil(vidautil);
            productos.get(espacio).setPrecio(precio);
            productos.get(espacio).setTamaño(tamano);
            productos.get(espacio).setDescripcion(descripcion);
            productos.get(espacio).setNombre(nombre);
            productos.get(espacio).setNumero(numero);
        }
        return productos;
    }

    public static ArrayList<Cliente> modcliente(ArrayList<Cliente> clientes, ArrayList<Producto> productos) {
        int resp = 0;
        for (Cliente c : clientes) {
            System.out.println(clientes.indexOf(c) + " " + c);
        }
        System.out.println("Ingrese el cliente que quiere modificar?");
        int espacio = sc.nextInt();
        if (espacio < clientes.size()) {
            System.out.println("Cual es el nombre del empleado");
            String nombre = sc.next();
            System.out.println("Cual es el ID");
            String id = sc.next();
            System.out.println("Cual es la edad");
            int edad = sc.nextInt();
            System.out.println("Cual es la altura");
            double altura = sc.nextDouble();
            System.out.println("Cual es el peso");
            double peso = sc.nextDouble();
            System.out.println("Cual es la residencia");
            String residencia = sc.next();
            System.out.println("Cuanto dinero tiene en el bolsillo");
            double dinero = sc.nextDouble();
            System.out.println("En que fecha compro su primer producto?");
            String fecha = sc.next();

            clientes.get(espacio).setNombre(nombre);
            clientes.get(espacio).setId(id);
            clientes.get(espacio).setEdad(edad);
            clientes.get(espacio).setAltura(altura);
            clientes.get(espacio).setPeso(peso);
            clientes.get(espacio).setResidencia(residencia);
            clientes.get(espacio).setDinero(dinero);
            clientes.get(espacio).setPrimercompra(fecha);
            do {
                for (Producto p : productos) {
                    System.out.println(productos.indexOf(p) + " " + p);
                }
                System.out.println("Cual producto ha comprado?");
                int espacio2 = sc.nextInt();
                if (espacio2 < productos.size()) {
                    clientes.get(espacio).getProducto().add(productos.get(espacio2));
                }
                System.out.println("Desea agregar otro producto? s/n");
                resp = sc.next().charAt(0);
            } while (resp != 'n');

        }
        return clientes;
    }

    public static ArrayList<Empleado> modempleado(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(empleados.indexOf(e) + " " + e);
        }
        System.out.println("Cual empleado desea modificar?");
        int espacio = sc.nextInt();
        if (espacio < empleados.size()) {
            System.out.println("Cual es el nombre del empleado");
            String nombre = sc.next();
            System.out.println("Cual es el ID");
            String id = sc.next();
            System.out.println("Cual es la edad");
            int edad = sc.nextInt();
            System.out.println("Cual es la altura");
            double altura = sc.nextDouble();
            System.out.println("Cual es el peso");
            double peso = sc.nextDouble();
            System.out.println("Cual es la residencia");
            String residencia = sc.next();

            empleados.get(espacio).setNombre(nombre);
            empleados.get(espacio).setId(id);
            empleados.get(espacio).setEdad(edad);
            empleados.get(espacio).setAltura(altura);
            empleados.get(espacio).setPeso(peso);
            empleados.get(espacio).setResidencia(residencia);
            
            if (empleados.get(espacio) instanceof Empleado_Seguridad) {
                System.out.println("Que dia trabaja el empleado de seguridad?");
                String dia = sc.next();
                ((Empleado_Seguridad)empleados.get(espacio)).setDia(dia);
            }
            if (empleados.get(espacio) instanceof Empleado_Carga) {
                System.out.println("Cual es la hora de entrada?");
                String horaE = sc.next();
                System.out.println("Cual es la hora de salida?");
                String horaS = sc.next();
                System.out.println("Que fecha inicio su trabajo");
                String fechainicio = sc.next();
                
                ((Empleado_Carga)empleados.get(espacio)).setHora_entrada(horaE);
                ((Empleado_Carga)empleados.get(espacio)).setHora_salida(horaS);
                ((Empleado_Carga)empleados.get(espacio)).setFecha_entrada(fechainicio);
            }
        }
        return empleados;
    }

    public static ArrayList<Producto> removerproducto(ArrayList<Producto> productos){
        for (Producto p : productos) {
            System.out.println(productos.indexOf(p)+" "+p);
        }
        System.out.println("Cual producto desea eliminar");
        int espacio=sc.nextInt();
        if (espacio<productos.size()) {
            productos.remove(espacio);
        }
        return productos;
    }
    
    public static ArrayList<Cliente> removercliente(ArrayList<Cliente> clientes){
        for (Cliente c : clientes) {
            System.out.println(clientes.indexOf(c)+" "+c);
        }
        System.out.println("Cual cliente quiere eliminar?");
        int espacio=sc.nextInt();
        if (espacio<clientes.size()) {
            clientes.remove(espacio);
        }
        return clientes;
    }
    
    public static ArrayList<Empleado> removerempleado(ArrayList<Empleado> empleados){
        for (Empleado e : empleados) {
            System.out.println(empleados.indexOf(e)+" "+e);
        }
        System.out.println("Cual empleado quiere remover?");
        int espacio=sc.nextInt();
        if (espacio<empleados.size()) {
            empleados.remove(espacio);
        }
        return empleados;
    }
}
