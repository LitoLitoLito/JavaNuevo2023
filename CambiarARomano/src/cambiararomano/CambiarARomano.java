/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
y se muestre su equivalente en romano.
 */
package cambiararomano;

import java.util.Scanner;


public class CambiarARomano {


    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);

    // Leer un número entero entre 1 y 10.
    System.out.print("Ingrese un número entre 1 y 10: ");
    int numero = leer.nextInt();

    // Mostrar el equivalente en número romano.
    switch (numero) {
      case 1:
        System.out.println("I");
        break;
      case 2:
        System.out.println("II");
        break;
      case 3:
        System.out.println("III");
        break;
      case 4:
        System.out.println("IV");
        break;
      case 5:
        System.out.println("V");
        break;
      case 6:
        System.out.println("VI");
        break;
      case 7:
        System.out.println("VII");
        break;
      case 8:
        System.out.println("VIII");
        break;
      case 9:
        System.out.println("IX");
        break;
      case 10:
        System.out.println("X");
        break;
      default:
        System.out.println("ERROR: el número debe estar entre 1 y 10.");
        break;
    }
    }
    
}
