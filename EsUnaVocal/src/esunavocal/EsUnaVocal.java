/*
Elaborar un algoritmo en el cuál se ingrese una letra 
y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package esunavocal;

import java.util.Scanner;

public class EsUnaVocal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa una letra: ");
    String letra = scanner.next();
    letra = letra.toLowerCase();

    if (letra.length() == 1) {
      if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
        System.out.println("La letra ingresada es una vocal.");
      } else {
        System.out.println("La letra ingresada no es una vocal.");
      }
    } else {
      System.out.println("La entrada no es una letra.");
    }
    }
    
}
