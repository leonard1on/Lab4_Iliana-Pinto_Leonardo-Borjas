/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            System.out.println("3. Agregar producto\n"
                    + "4. Modificar Cliente\n"
                    + "5. Modificar Empleado\n"
                    + "6. Modificar Producto\n"
                    + "7. Eliminar Cliente\n"
                    + "8. Eliminar Empleado\n"
                    + "9. Eliminar Producto\n"
                    + "10. Reportes"
                    + "");
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
                            } else {
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
                            } else {
                                almacen.add(new AlmacenPlataforma(productos.get(posicion3), tamaño, altura));
                            }
                            break;
                        case 4:
                            AlmaceneTemporal at=new AlmaceneTemporal(new Producto(), tamaño, altura);
                            for (Producto p : productos) {
                                System.out.println(productos);
                            }
                            System.out.println("Que producto quiere agregarle?");
                            int espacio=sc.nextInt();
                            if (espacio<productos.size()) {
                                ((AlmaceneTemporal)almacen.get(espacio)).getPro().add(productos.get(espacio));
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
                case 4:
                    clientes=modcliente(clientes, productos);
                    break;
                case 5:
                    empleados=modempleado(empleados);
                    break;
                case 6:
                    productos=modproducto(productos);
                    break;
                case 7:
                    clientes=removercliente(clientes);
                    break;
                case 8:
                    empleados=removerempleado(empleados);
                    break;
                case 9:
                    productos=removerproducto(productos);
                    break;
                case 10:
                    System.out.println("Reportes!!");
                    
                    System.out.println("Productos");
                    for (Producto pro : productos) {
                        System.out.println(productos.indexOf(pro)+" "+pro);
                    }
                    
                    System.out.println("Almacenes");
                    for (Almacenes al : almacen) {
                        System.out.println(almacen.indexOf(al)+" "+al);
                    }
                    
                    System.out.println("Clientes");
                    for (Persona cliente : clientes) {
                        System.out.println(clientes.indexOf(cliente)+" "+cliente);
                    }
                    
                    System.out.println("Empleados");
                    for (Persona empleado : empleados) {
                        System.out.println(empleados.indexOf(empleado)+" "+empleado);
                    }
                    
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
                sc = new Scanner(System.in);
                System.out.println("Cual es el ID");
                id = sc.next();
                ValidarID(id);////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                pasar = false;
            } catch (Excepcion e) {
                pasar = true;
            } catch (Exception ex) {
                Logger.getLogger(Lab4_Iliana_Leonardo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        boolean pasar2 = true;
        int edad = 0;
        while (pasar2) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Cual es la edad");
                edad = sc.nextInt();
                validarEdad(edad);

                pasar2 = false;
            } catch (Excepcion e) {
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

    public static void ValidarID(String id) throws Exception {
        String numero = id.substring(0, 4);
        if (!"0801".equals(numero)) {
            throw new Exception("El ID ingresado no es de Francisco Morazan");
        } else {

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

    public static ArrayList<Persona> modcliente(ArrayList<Persona> clientes, ArrayList<Producto> productos) {
        int resp = 0;
        for (Persona c : clientes) {
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
            ((Cliente)clientes.get(espacio)).setDinero(dinero);
            ((Cliente)clientes.get(espacio)).setPrimercompra(fecha);
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

    public static ArrayList<Persona> modempleado(ArrayList<Persona> empleados) {
        for (Persona e : empleados) {
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
                ((Empleado_Seguridad) empleados.get(espacio)).setDia(dia);
            }
            if (empleados.get(espacio) instanceof Empleado_Carga) {
                System.out.println("Cual es la hora de entrada?");
                String horaE = sc.next();
                System.out.println("Cual es la hora de salida?");
                String horaS = sc.next();
                System.out.println("Que fecha inicio su trabajo");
                String fechainicio = sc.next();

                ((Empleado_Carga) empleados.get(espacio)).setHora_entrada(horaE);
                ((Empleado_Carga) empleados.get(espacio)).setHora_salida(horaS);
                ((Empleado_Carga) empleados.get(espacio)).setFecha_entrada(fechainicio);
            }
        }
        return empleados;
    }

    public static ArrayList<Producto> removerproducto(ArrayList<Producto> productos) {
        for (Producto p : productos) {
            System.out.println(productos.indexOf(p) + " " + p);
        }
        System.out.println("Cual producto desea eliminar");
        int espacio = sc.nextInt();
        if (espacio < productos.size()) {
            productos.remove(espacio);
        }
        return productos;
    }

    public static ArrayList<Persona> removercliente(ArrayList<Persona> clientes) {
        for (Persona c : clientes) {
            System.out.println(clientes.indexOf(c) + " " + c);
        }
        System.out.println("Cual cliente quiere eliminar?");
        int espacio = sc.nextInt();
        if (espacio < clientes.size()) {
            clientes.remove(espacio);
        }
        return clientes;
    }

    public static ArrayList<Persona> removerempleado(ArrayList<Persona> empleados) {
        for (Persona e : empleados) {
            System.out.println(empleados.indexOf(e) + " " + e);
        }
        System.out.println("Cual empleado quiere remover?");
        int espacio = sc.nextInt();
        if (espacio < empleados.size()) {
            empleados.remove(espacio);
        }
        return empleados;
    }


}
