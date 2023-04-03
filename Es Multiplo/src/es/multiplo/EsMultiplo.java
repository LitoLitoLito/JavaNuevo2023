/*
Crea un procedimiento EsMultiplo que reciba los dos números 
pasados por el usuario, validando que el primer número múltiplo 
del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.
 */
package es.multiplo;

import java.util.Scanner;

public class EsMultiplo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número --> ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro número --> ");
        int num2 =leer.nextInt();
        EsMultiplo(num1, num2);
        
    }
    
    
    public static void EsMultiplo(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        } else if (num1 % num2 == 0) {
        System.out.println("El primer número Es múltiplo del segundo");
            } else {
        System.out.println("El primer número No Es múltiplo del segundo");
                    }
    }
    
}

