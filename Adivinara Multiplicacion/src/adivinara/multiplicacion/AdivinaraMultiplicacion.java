/*
Realice un programa para que el usuario adivine el resultado 
de una multiplicación entre dos números generados aleatoriamente 
entre 0 y 10. El programa debe indicar al usuario si su respuesta 
es o no correcta. En caso que la respuesta sea incorrecta se debe 
permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar 
la función Math.random() de Java.

 */
package adivinara.multiplicacion;

import java.util.Scanner;


public class AdivinaraMultiplicacion {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int respuesta;
        boolean respuesta_correcta = false;
        
        System.out.printf("Adivine la respuesta de %d x %d:\n", num1, num2);
        
        do {
            System.out.print("Ingrese su respuesta: ");
            respuesta = leer.nextInt();
            
            if (respuesta == num1 * num2) {
                System.out.println("¡Respuesta correcta!");
                respuesta_correcta = true;
            } else {
                System.out.println("Respuesta incorrecta. Inténtelo nuevamente.");
            }
        } while (!respuesta_correcta);
    }
    
}
