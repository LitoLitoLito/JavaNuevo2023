/*
 Realice un programa que calcule y visualice el valor máximo,
el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. 
Realice dos versiones del programa, una usando 
el bucle “while” y otra con el bucle “do - while”.
 */
package maximo.minimo.promedio;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class MaximoMinimoPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 /*       Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int n = leer.nextInt();

        int i = 0;
        double numero, suma = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        do {
            System.out.print("Ingrese un número: ");
            numero = leer.nextDouble();

            suma += numero;

            if (numero < min) {
                min = numero;
            }

            if (numero > max) {
                max = numero;
            }

            i++;
        } while (i < n);

        double promedio = suma / n;

        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El promedio es: " + promedio);
  */
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a evaluar: ");
        int n = leer.nextInt();

        int i = 0;
        double numero, suma = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        while (i < n) {
            System.out.print("Ingrese un número: ");
            numero = leer.nextDouble();

            suma += numero;

            if (numero < min) {
                min = numero;
            }

            if (numero > max) {
                max = numero;
            }

            i++;
        }

        double promedio = suma / n;

        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El promedio es: " + promedio);
        
    }
    
}
