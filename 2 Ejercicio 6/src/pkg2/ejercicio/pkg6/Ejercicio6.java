/*
Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
package pkg2.ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int numero1, numero2;
        Scanner numeroIngresado = new Scanner(System.in);
        
        
        System.out.println("Ingrese un Número");
        numero1 = numeroIngresado.nextInt();
        
        System.out.println("Ingrese Otro Número");
        numero2 = numeroIngresado.nextInt();
        
        if (numero1>25 && numero2>25 ){
            System.out.println("Los dos números ingresados son mayores a 25");
        }else{
            if (numero1==25 && numero2==25) {
                System.out.println("Los dos números ingresados son iguales a 25"); 
            } else{
                if (numero1>=25 || numero2==25) {
                  System.out.println("Uno de los números ingresado en mayor o igual a 25");   
                }else{
                    System.out.println("Los dos números ingresados son meores a 25");  
                }
            }
        }
        
        
    }
    
}
