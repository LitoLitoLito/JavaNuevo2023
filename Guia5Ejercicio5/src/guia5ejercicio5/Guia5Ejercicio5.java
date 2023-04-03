/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package guia5ejercicio5;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
                int[][] cuadrado = new int[3][3];
        Scanner leer = new Scanner(System.in);

        
        System.out.println("Introduce los valores del cuadrado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                cuadrado[i][j] = leer.nextInt();
                
                while (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.print("Valor inválido. Introduce un número entre 1 y 9: ");
                    cuadrado[i][j] = leer.nextInt();
                }
            }
        }


        boolean esMagico = true;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaDiagonalA = 0;
        int sumaDiagonalB = 0;
        
        for (int i = 0; i < 3; i++) {
            sumaDiagonalA += cuadrado[i][i];
        }
        
        for (int i = 0; i < 3; i++) {
            sumaDiagonalB += cuadrado[i][2 - i];
        }
        
        if (sumaDiagonalA != sumaDiagonalB) {
            esMagico = false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != sumaDiagonalA) {
                esMagico = false;
            }
            sumaFila = 0;
        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumaColumna += cuadrado[i][j];
            }
            if (sumaColumna != sumaDiagonalA) {
                esMagico = false;
            }
            sumaColumna = 0;
        }

        if (esMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
        
    }
    
}
