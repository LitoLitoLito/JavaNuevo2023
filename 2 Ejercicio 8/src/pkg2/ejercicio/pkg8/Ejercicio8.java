/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package pkg2.ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entre 0 y 10");
        int nota = leer.nextInt();
        
    
    
        while (nota>10) {
            System.out.println("Ingrese un número entre 0 y 10");
            nota = leer.nextInt();
        }
        System.out.println("Su número ingresado es --> "+nota);
        
    }
     
}
