/*
 Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaApplication4;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class javaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner frase = new Scanner(System.in);
        
        String fraseAConvertir;
        
        System.out.println("Ingrese una frase ");
        
        fraseAConvertir = frase.nextLine();
        
        System.out.println(fraseAConvertir.toUpperCase());
        System.out.println(fraseAConvertir.toLowerCase());
    }
    
}
