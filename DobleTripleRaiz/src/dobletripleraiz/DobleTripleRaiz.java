/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada 
de ese número. 
Nota: investigar la función Math.sqrt().
 */
package dobletripleraiz;

import java.util.Scanner;


public class DobleTripleRaiz {

   
    public static void main(String[] args) {
        
        int numeroEntero;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        numeroEntero = leer.nextInt();
        
        System.out.println("El Doble de --> " + numeroEntero + " es --> " + (numeroEntero*2));
        System.out.println("El Triple de --> " + numeroEntero + " es --> " + (numeroEntero*3));
        System.out.println("La raiz cuadrada de --> " + numeroEntero + " es --> " + (Math.sqrt(numeroEntero)));
        
    }
    
}
