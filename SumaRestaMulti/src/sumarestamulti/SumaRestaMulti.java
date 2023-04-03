/*
 Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package sumarestamulti;

import java.util.Scanner;


public class SumaRestaMulti {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        boolean salir = false;
        
        System.out.print("Ingrese el primer número: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        while (!salir) {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("La suma es: " + (num1 + num2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("La resta es: " + (num1 - num2));
                    System.out.println("");
                    break;
                case 3:
                   System.out.println("");
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    num2 = leer.nextInt();
                    if (num2 != 0) {
                        System.out.println("La división es: " + ((double)num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char respuesta = leer.next().charAt(0);
                    if (respuesta == 'S' || respuesta == 's') {
                        salir = true;
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción inválida");
                    System.out.println("");
                    break;
            }
        }
    }
    
}
