/*
 Escribir un programa que pida dos números enteros 
por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package javaapplication3;
import java.util.Scanner;


public class numerosEnteros {

    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        Scanner numeroIngresado = new Scanner(System.in);
        System.out.println("Ingrese un Número ");
        numero1 = numeroIngresado.nextInt();
        System.out.println("Ingrese un Número ");
        numero2 = numeroIngresado.nextInt();
        System.out.println("La suma es " + (numero1+numero2));
        
        
    }
    
}
