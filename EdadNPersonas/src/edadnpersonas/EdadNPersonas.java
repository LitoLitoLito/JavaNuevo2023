/*
Diseñe una función que pida el nombre y la edad de N personas 
e imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando 
personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package edadnpersonas;

import java.util.Scanner;

public class EdadNPersonas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            agregarPersona();
            System.out.println("¿Desea agregar otra persona? (Si/No)");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }
        
    }

    public static void agregarPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona:");
        int edad = leer.nextInt();
        String mensaje = "La persona " + nombre + " es ";
        if (edad >= 18) {
            mensaje += "mayor de edad.";
        } else {
            mensaje += "menor de edad.";
        }
        System.out.println(mensaje);
    }
    
}
