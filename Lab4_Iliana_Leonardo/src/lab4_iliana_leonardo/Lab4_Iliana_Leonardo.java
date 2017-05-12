/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.Scanner;

/**
 *
 * @author Leonardo Borjas
 */
public class Lab4_Iliana_Leonardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
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
                default:
                    throw new AssertionError();
            }
        } while (true);
        
    }
    
}
