/*
 Escriba un programa que lea números enteros. Si el número es múltiplo 
de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package multiplo.de.cinco;

import java.util.Scanner;

public class MultiploDeCinco {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numerosLeidos = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        
        while (true) {
            System.out.print("Ingrese un número entero: ");
            int num = leer.nextInt();
            if (num < 0) {
                numerosLeidos++;
                continue;
            }
            numerosLeidos++;
            if (num % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
            if (num % 5 == 0) {
                System.out.println("Se detuvo la lectura.");
                break;
            }
        }
        
        System.out.println("Cantidad de números leídos: " + numerosLeidos);
        System.out.println("Cantidad de números pares: " + numerosPares);
        System.out.println("Cantidad de números impares: " + numerosImpares);
    }
    
}
