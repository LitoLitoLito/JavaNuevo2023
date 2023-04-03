/*
Realizar un algoritmo que llene un vector con los 100 
primeros números enteros y los muestre por pantalla 
en orden descendente.
 */
package guia5ejercicio1;

public class Guia5Ejercicio1 {

    public static void main(String[] args) {
        int[] numerosHasta100 = new int[100];
        
        for (int i = 0; i < 100; i++) {
            numerosHasta100[i] = i;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print(" " + numerosHasta100[i]);
        }
        System.out.println(" ");
    }
    
}
