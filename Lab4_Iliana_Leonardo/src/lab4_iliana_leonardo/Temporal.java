/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_iliana_leonardo;

import java.util.Scanner;

/**
 *
 * @author iliana
 */
public class Temporal {
    Scanner sc = new Scanner (System.in);
    
    
    public void metodo(){
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
            
            
            
            
            
            
            
}
