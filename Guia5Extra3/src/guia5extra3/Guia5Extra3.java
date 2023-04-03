/*
 Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función 
o procedimiento que imprima el vector.
 */
package guia5extra3;

import java.util.Random;

public class Guia5Extra3 {

    public static void main(String[] args) {

        int tamanoDelVector = 3;
        int[] vector = new int[tamanoDelVector];

        rellenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

    public static void rellenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + (i+1) + " --> " + vector[i]);
            
        }

    }

}
