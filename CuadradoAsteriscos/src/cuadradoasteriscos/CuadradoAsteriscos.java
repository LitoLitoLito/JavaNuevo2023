/*
 Dibujar un cuadrado de N elementos por lado 
utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos 
por lado se deberá dibujar lo siguiente:
 */
package cuadradoasteriscos;

import java.util.Scanner;


public class CuadradoAsteriscos {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        int numeroIngresado = leer.nextInt();
        
        for (int i = 0; i < numeroIngresado; i++) {
            for (int j = 0; j < numeroIngresado; j++) {
                if (i == 0 || i == numeroIngresado-1 || j == 0 || j == numeroIngresado-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
