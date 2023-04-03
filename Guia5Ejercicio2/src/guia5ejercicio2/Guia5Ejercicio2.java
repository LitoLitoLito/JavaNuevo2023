/*
Realizar un algoritmo que llene un vector de tamaño N 
con valores aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package guia5ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Guia5Ejercicio2 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int tamanoDelVector, numero, encontrado = 0, repetido = 0;
        
        System.out.print("Ingrese el tamaño del vector: ");
        tamanoDelVector = leer.nextInt();
        int[] vector = new int[tamanoDelVector];
        

        for (int i = 0; i < tamanoDelVector; i++) {
            vector[i] = aleatorio.nextInt(1);
        }
        

        System.out.print("Ingrese el número a buscar: ");
        numero = leer.nextInt();
        

        for (int i = 0; i < tamanoDelVector; i++) {
            if (vector[i] == numero) {
                encontrado = i;
                System.out.println("El número se encuentra en la posición " + i + " del vector.");
                repetido++;
            }
        }
        

        if (encontrado == 0) {
            System.out.println("El número no se encuentra en el vector.");
        } else {
            System.out.println(" ");
            if (repetido > 1) {
                System.out.println("El número está repetido " + repetido + " veces en el vector.");
            } else {
                System.out.println("El número no está repetido en el vector.");
            }
        }
        
        for (int i = 0; i < tamanoDelVector; i++) {
            System.out.println(" "+vector[i]);
    }
}
}