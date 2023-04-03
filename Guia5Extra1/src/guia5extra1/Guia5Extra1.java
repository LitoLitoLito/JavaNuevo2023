/*
Realizar un algoritmo que calcule la suma de todos los elementos 
de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5extra1;

import java.util.Scanner;

public class Guia5Extra1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int tamanoDelVector, sumaElementosVector = 0;

        System.out.print("Ingrese el tamaño del vector: ");
        tamanoDelVector = leer.nextInt();

        int[] vector = new int[tamanoDelVector];

        
        for (int i = 0; i < tamanoDelVector; i++) {
            System.out.print("Ingrese Elemento " + (i+1) + " del vector  --> ");
            vector[i] = leer.nextInt();
        }

        for (int i = 0; i < tamanoDelVector; i++) {
            sumaElementosVector += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + sumaElementosVector);

    }

}
