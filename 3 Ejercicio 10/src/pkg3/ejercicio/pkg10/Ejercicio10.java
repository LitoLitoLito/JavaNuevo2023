/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package pkg3.ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int numIngresado;
        Scanner leer = new Scanner(System.in);
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entre 1 y 20");
            numIngresado = leer.nextInt();
            if (numIngresado>0 && numIngresado<21){
                System.out.print("  " + numIngresado);
                    for (int k=0; k > numIngresado ; k++){
                        System.out.print(" *");
                }
            
        }
        
        
        
        
        
    }

}
