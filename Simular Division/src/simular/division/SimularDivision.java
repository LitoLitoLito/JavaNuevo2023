/*
Simular la división usando solamente restas. Dados dos números enteros 
mayores que uno, realizar un algoritmo que calcule el cociente y el residuo 
usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un 
resultado menor que el divisor, este resultado es el residuo, y el número 
de restas realizadas es el cociente.
 */
package simular.division;

import java.util.Scanner;

public class SimularDivision {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dividendo1, dividendo, divisor, cociente = 0, resto;
        
        System.out.print("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        divisor = leer.nextInt();
        dividendo1 = dividendo;
        if (divisor <= 1 || dividendo <= 1) {
            System.out.println("Error: los números deben ser mayores que uno.");
            return;
        }
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            System.out.println(dividendo1+" - "+divisor+" = "+ dividendo);
            dividendo1 = dividendo;
            cociente++;
            
        }
        
        resto = dividendo;
        
        System.out.println("Cociente: "+ cociente);
        System.out.println("Residuo: "+ resto);
    }
    
}
