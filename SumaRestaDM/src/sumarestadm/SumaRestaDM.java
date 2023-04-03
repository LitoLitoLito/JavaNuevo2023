/*
 Crea una aplicación que le pida dos números al usuario 
y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main.
 */
package sumarestadm;

import java.util.Scanner;


public class SumaRestaDM {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número --> ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número --> ");
        double num2 = leer.nextDouble();
        boolean salir = false;
        
        
        while (!salir) {
            System.out.println("");
        System.out.println("Ingrese Opción para la operación a realizar");
        System.out.println("--> Suma ----------- (1)");
        System.out.println("--> Resta ---------- (2)");
        System.out.println("--> Multiplicación - (3)");
        System.out.println("--> División ------- (4)");
        System.out.print("OPCIÓN --> ");
        String operacion = leer.next();

        double resultado = 0;

        switch (operacion) {
            case "1":
                resultado = Sumar(num1, num2);
                System.out.println("El resultado de la operación es: " + resultado);
                break;
            case "2":
                resultado = Restar(num1, num2);
                System.out.println("El resultado de la operación es: " + resultado);
                break;
            case "3":
                resultado = Multiplicar(num1, num2);
                System.out.println("El resultado de la operación es: " + resultado);
                break;
            case "4":
                resultado = Dividir(num1, num2);
                System.out.println("El resultado de la operación es: " + resultado);
                break;
            case "5":
                    System.out.println("");
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char respuesta = leer.next().charAt(0);
                    if (respuesta == 'S' || respuesta == 's') {
                        salir = true;
                    }
            default:
                System.out.println("Operación no válida");
                break;
        }
        }
        
        

        System.out.println("");
        
        System.out.println("");

        
    }

    public static double Sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double Restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double Multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double Dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    
}
