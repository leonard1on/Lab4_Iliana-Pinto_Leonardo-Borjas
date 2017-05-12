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

    Scanner sc = new Scanner(System.in);
    

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
