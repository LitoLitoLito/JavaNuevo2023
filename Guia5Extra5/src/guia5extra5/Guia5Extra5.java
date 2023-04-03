/*
Realizar un programa que llene una matriz de tamaño NxM 
con valores aleatorios y muestre la suma de sus elementos.
 */
package guia5extra5;

import java.util.Random;

public class Guia5Extra5 {

    public static void main(String[] args) {

        // Declarar variables para el tamaño de la matriz
        int n = 5; // número de filas
        int m = 5; // número de columnas

        // Crear objeto Random para generar valores aleatorios
        Random random = new Random();

        // Crear matriz y llenarla con valores aleatorios
        int[][] matriz = new int[n][m];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10); // Generar número aleatorio entre 0 y 9
                suma += matriz[i][j];
            }
        }

        // Mostrar la matriz y la suma de sus elementos
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);

    }

}
