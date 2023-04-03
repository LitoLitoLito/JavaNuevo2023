/*
Escribir un programa que lea un número entero y devuelva 
el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. 
Nota: recordar que las variables de tipo entero 
truncan los números o resultados.
 */
package numeros.digitos;

import java.util.Scanner;


public class NumerosDigitos {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = leer.nextInt();

        int contador = 0;
        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
        
    }
    
}
