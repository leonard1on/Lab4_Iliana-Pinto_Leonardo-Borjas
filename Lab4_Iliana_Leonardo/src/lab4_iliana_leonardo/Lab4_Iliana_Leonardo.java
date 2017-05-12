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
        ArrayList<Persona> clientes=new ArrayList();
        ArrayList<Persona> empleados=new ArrayList();
        ArrayList<Producto> productos=new ArrayList();
        do {
            System.out.println("1. Agregar almacen");
            System.out.println("2. Agregar persona");
            System.out.println("3. Agregar producto");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de almacen desea agregar?");
                    System.out.println("1. Almacenes de planta");
                    System.out.println("2. Almacenes regionales");
                    System.out.println("3. Almacenes de plataforma");
                    System.out.println("4. Almacenes temporales");
                    break;
                case 2:
                    
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
        int menu=0;
        System.out.println("Creacion de empleado\n"
                + "Cual es el nombre del empleado");
        String nombre=sc.next();
        System.out.println("Cual es el ID");
        String id=sc.next();
        System.out.println("Cual es la edad");
        int edad=sc.nextInt();
        System.out.println("Cual es la altura");
        double altura=sc.nextDouble();
        System.out.println("Cual es el peso");
        double peso=sc.nextDouble();
        System.out.println("Cual es la residencia");
        String residencia=sc.next();
        
        do {
            System.out.println("Que tipo de persona desea agregar\n"
                    + "1. Cliente\n"
                    + "2. Empleado");
            menu=sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Cuanto dinero tiene en el bolsillo");
                    double dinero=sc.nextDouble();
                    System.out.println("En que fecha compro su primer producto?");
                    String fecha=sc.next();
                    
                    
                    
                    
                    break;
                case 2:
                    break;
            }
            
            
            
        } while (menu!=1 && menu!=2);
        
        
        
        return new Empleado();
    }
    
    public static Producto producto(){
        System.out.println("Cual es la fecha de emision?");
        String fechaemision=sc.next();
        System.out.println("Cual es la vida util?");
        int vidautil=sc.nextInt();
        System.out.println("Cual es el precio?");
        double precio=sc.nextDouble();
        System.out.println("Cual es el tamano?");
        int tamano=sc.nextInt();
        System.out.println("Cual es la descripcion?");
        String descripcion=sc.next();
        System.out.println("Cual es el nombre?");
        String nombre=sc.next();
        System.out.println("Numero de producto?");
        int numero=sc.nextInt();
        
        
        return new Producto(vidautil,fechaemision, precio, tamano,descripcion,nombre,numero);
    }

}
