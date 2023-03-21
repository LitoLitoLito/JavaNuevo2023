/*
Escriba un programa que lea 20 números. Si el nÃºmero leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberÃ¡ calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break
 */
package pkg3.ejercicio.pkg9;

import java.util.Scanner;


public class Ejercicio9 {

  
    public static void main(String[] args) {
        int contador = 0;
        int numero;
        int suma = 0;
        Scanner leer = new Scanner(System.in);
        
                
        do {            
            System.out.println("Ingrese un número");
            numero = leer.nextInt();
            if (numero==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (numero<0){
                contador = contador + 1;
                continue;
            }
            suma = suma + numero;
            contador = contador + 1;
            
            
        } while (contador<4);
        
        System.out.println("La suma de los números ingresados es --> "+suma);
        
    }
    
}

