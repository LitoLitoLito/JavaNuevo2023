/*
Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package grados;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        float gradosCentigrados;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese Grados Centígrados");
        gradosCentigrados = leer.nextFloat();
        
        float gradosFahrenheit = 32 + (9 * gradosCentigrados / 5);
        
        
        System.out.println(gradosCentigrados+" Grados Centígrados es --> "+gradosFahrenheit+" Grados Fahrenheit");
        
    }
    
}
