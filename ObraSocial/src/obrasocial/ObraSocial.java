/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrasocial;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class ObraSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);

    // Leer el tipo de socio (A, B o C).
    System.out.print("Ingrese el tipo de socio (A, B o C): ");
    String tipoSocio = leer.next();
    

    // Leer el costo del tratamiento.
    System.out.print("Ingrese el costo del tratamiento: ");
    double costoTratamiento = leer.nextDouble();

    // Calcular el importe a pagar de acuerdo al tipo de socio.
    double importeAPagar = 0.0;
    switch (tipoSocio) {
      case "A":
        importeAPagar = costoTratamiento * 0.5;
        break;
      case "B":
        importeAPagar = costoTratamiento * 0.65;
        break;
      case "C":
        importeAPagar = costoTratamiento;
        break;
      default:
        System.out.println("Error: el tipo de socio ingresado no es válido.");
        return;
    }

    // Mostrar el importe a pagar.
    System.out.println("El importe a pagar es: $" + importeAPagar);
    }
    
}
