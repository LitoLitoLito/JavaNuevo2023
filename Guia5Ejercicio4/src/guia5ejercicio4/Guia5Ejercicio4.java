/*
Realizar un programa que rellene un matriz de 4 x 4 
de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B 
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5ejercicio4;

import java.util.Random;

/**
 *
 * @author litit
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];

        Random aleatorio = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(100);
            }
        }
        

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(traspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
