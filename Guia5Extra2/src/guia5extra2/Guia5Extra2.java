/*
Escriba un programa que averigüe si dos vectores de N enteros 
son iguales (la comparación deberá detenerse en cuanto se detecte 
alguna diferencia entre los elementos).
 */
package guia5extra2;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class Guia5Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);
      int tamanoDelVector;
      boolean vectoresIguales = true;
      
      System.out.print("Ingrese el tamaño de los vectores: ");
      tamanoDelVector = leer.nextInt();
      
      int[] vector1 = new int[tamanoDelVector];
      int[] vector2 = new int[tamanoDelVector];
      
      System.out.println("Ingrese los valores del primer vector:");
      for (int i = 0; i < tamanoDelVector; i++) {
         System.out.print("Elemento " + (i+1) + " --> ");
         vector1[i] = leer.nextInt();
      }
      
      System.out.println("Ingrese los valores del segundo vector:");
      for (int i = 0; i < tamanoDelVector; i++) {
         System.out.print("Elemento " + (i+1) + " --> ");
         vector2[i] = leer.nextInt();
      }
      
      for (int i = 0; i < tamanoDelVector; i++) {
         if (vector1[i] != vector2[i]) {
            vectoresIguales = false;
            break;
         }
      }
      
      if (vectoresIguales) {
         System.out.println("Los vectores son iguales.");
      } else {
         System.out.println("Los vectores son diferentes.");
      }
        
    }
    
}
