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
 * @author Leonardo Borjas
 */
public class Lab4_Iliana_Leonardo {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> clientes = new ArrayList();
        ArrayList<Persona> empleados = new ArrayList();
        ArrayList<Producto> productos = new ArrayList();
        ArrayList<Almacenes> almacen = new ArrayList();
        do {
            System.out.println("1. Agregar almacen");
            System.out.println("2. Agregar persona");
            System.out.println("3. Agregar producto");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño en metros");
                    double tamaño = sc.nextInt();
                    System.out.println("Ingrese la altura");
                    double altura = sc.nextInt();
                    System.out.println("Que tipo de almacen desea agregar?");
                    System.out.println("1. Almacenes de planta");
                    System.out.println("2. Almacenes regionales");
                    System.out.println("3. Almacenes de plataforma");
                    System.out.println("4. Almacenes temporales");
                    int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:

                            System.out.println("Ingrese numero de planta:");
                            int numeroPlanta = sc.nextInt();
                            for (Producto p : productos) {
                                System.out.println(productos);
                            }
                            System.out.println("Ingrese una posicion");
                            int posicion = sc.nextInt();
                            if (posicion >= productos.size()) {
                                System.out.println("Posicion ingresada incorrecta");
                            } else {
                                almacen.add(new AlmacenPlanta(numeroPlanta, productos.get(posicion), tamaño, altura));
                            }

                            break;
                        case 2:
                            System.out.println("Ingrese departamento:");
                            sc.nextLine();
                            String departamento = sc.nextLine();
                            for (Producto p : productos) {
                                System.out.println(productos);
                            }
                            System.out.println("Ingrese una posicion:");
                            int posicion2 = sc.nextInt();
                            if (posicion2 >= productos.size()) {
                                System.out.println("Posicion incorrecta");
                            }else{
                                almacen.add(new AlmacenRegional(departamento, productos.get(posicion2), tamaño, altura));
                            }
                            
                            break;
                        case 3:
                            for (Producto p : productos) {
                                System.out.println(productos);
                            }
                            System.out.println("Ingrese una posicion");
                            int posicion3 = sc.nextInt();
                            if (posicion3 >= productos.size()) {
                                System.out.println("Posicion incorrecta");
                            }else{
                                almacen.add(new AlmacenPlataforma(productos.get(posicion3), tamaño, altura));
                            }
                            break;
                        case 4:
                            for (Producto p : productos) {
                                System.out.println(productos);
                            }
                            System.out.println("Ingrese una posicion");
                            int posicion4 = sc.nextInt();
                            if (posicion4 >= productos.size()) {
                                System.out.println("Posicion incorrecta");
                            }else{
                                almacen.add(new AlmacenPlataforma(productos.get(posicion3), tamaño, altura));
                            }
                    }
                    break;
                case 2:
                    Persona p = empleado_cliente(productos);

                    if (p instanceof Cliente) {
                        clientes.add(p);
                    }
                    if (p instanceof Empleado_Seguridad) {
                        empleados.add(p);
                    }
                    if (p instanceof Empleado_Carga) {
                        empleados.add(p);
                    }

                    break;
                case 3:
                    productos.add(producto());
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);

    }

    public static Persona empleado_cliente(ArrayList<Producto> productos) {
        int menu = 0;
        char resp = 's';
        System.out.println("Creacion de empleado\n"
                + "Cual es el nombre del empleado");
        String nombre = sc.next();
        boolean pasar = true;
        String id = "";
        while (pasar) {
            try {
                System.out.println("Cual es el ID");
                id = sc.next();
                pasar = false;
            } catch (Exception e) {
                pasar = true;
            }
        }

        boolean pasar2 = true;
        int edad = 0;
        while (pasar2) {
            try {
                System.out.println("Cual es la edad");
                edad = sc.nextInt();
                pasar2 = false;
            } catch (Exception e) {
                pasar = true;
            }
        }

        System.out.println("Cual es la altura");
        double altura = sc.nextDouble();
        System.out.println("Cual es el peso");
        double peso = sc.nextDouble();
        System.out.println("Cual es la residencia");
        String residencia = sc.next();

        do {
            System.out.println("Que tipo de persona desea agregar\n"
                    + "1. Cliente\n"
                    + "2. Empleado");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Cuanto dinero tiene en el bolsillo");
                    double dinero = sc.nextDouble();
                    System.out.println("En que fecha compro su primer producto?");
                    String fecha = sc.next();
                    Cliente c = new Cliente(dinero, fecha, nombre, id, edad, altura, peso, residencia);

                    do {
                        for (Producto p : productos) {
                            System.out.println(productos.indexOf(p) + " " + p);
                        }
                        System.out.println("Cual producto ha comprado?");
                        int espacio = sc.nextInt();
                        if (espacio < productos.size()) {
                            c.getProducto().add(productos.get(espacio));
                        }
                        System.out.println("Desea agregar otro producto? s/n");
                        resp = sc.next().charAt(0);
                    } while (resp != 'n');

                    return c;
                case 2:
                    int resp2 = 0;
                    System.out.println("Cual es el sueldo del empleado?");
                    double sueldo = sc.nextDouble();
                    do {
                        System.out.println("Que tipo de empleado desea agregar?\n"
                                + "1. De Carga\n"
                                + "2. De Seguridad");
                        resp2 = sc.nextInt();
                        switch (resp2) {
                            case 1:
                                System.out.println("Que dia trabaja el empleado de seguridad?");
                                String dia = sc.next();
                                return new Empleado_Seguridad(dia, sueldo, nombre, id, edad, altura, peso, residencia);
                            case 2:
                                System.out.println("Cual es la hora de entrada?");
                                String horaE = sc.next();
                                System.out.println("Cual es la hora de salida?");
                                String horaS = sc.next();
                                System.out.println("Que fecha inicio su trabajo");
                                String fechainicio = sc.next();
                                return new Empleado_Carga(horaE, horaS, fechainicio, sueldo, nombre, id, edad, altura, peso, residencia);
                        }
                    } while (true);
            }

        } while (true);
    }

    public static Producto producto() {
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

        return new Producto(vidautil, fechaemision, precio, tamano, descripcion, nombre, numero);
    }

    public static void validarEdad(int años) throws Excepcion {
        if (años < 18) {
            throw new Excepcion("Debe ser mayor a 18");
        }
    }

    public static void validarID(String ID) throws Exception {
        String numeros = "";
        for (int i = 0; i < 4; i++) {
            numeros += ID.charAt(i);
        }
        if (!"0801".equals(numeros)) {
            throw new Exception("El ID ingresado no es de Francisco Morazan");
        }

    }

}
