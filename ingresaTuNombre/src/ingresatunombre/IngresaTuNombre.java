/*
 Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.
 */
package ingresatunombre;

import java.util.Scanner;

public class IngresaTuNombre {

    
    public static void main(String[] args) {
        
        String miNombre;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese tu nombre ");
        miNombre = leer.next();
        
        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---- > " + miNombre);
        System.out.println(" ");
        System.out.println(" ");
        
       
        
    }
    
}
