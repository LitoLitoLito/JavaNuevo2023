/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma 
de los números introducidos supere el límite inicial.
 */
package valorlimite;

import java.util.Scanner;

public class ValorLimite {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor límite positivo: ");
        int limite = leer.nextInt();
        int suma = 0;
        int numero;
        
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            numero = leer.nextInt();
            suma += numero;
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
