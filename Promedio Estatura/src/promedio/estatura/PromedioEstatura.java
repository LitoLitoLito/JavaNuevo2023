/*
Leer la altura de N personas y 
determinar el promedio de estaturas 
que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package promedio.estatura;

import java.util.Scanner;


public class PromedioEstatura {


    public static void main(String[] args) {
       
            Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de personas: ");
    int N = leer.nextInt();

    double altura, sumaTotal = 0, sumaBajo160 = 0;
    int contadorBajo160 = 0;

    for (int i = 0; i < N; i++) {
      System.out.print("Ingrese la altura de la persona " + (i+1) + ": ");
      altura = leer.nextDouble();

      sumaTotal += altura;

      if (altura < 1.60) {
        sumaBajo160 += altura;
        contadorBajo160++;
      }
    }

    double promedioTotal = sumaTotal / N;
    double promedioBajo160 = (contadorBajo160 > 0) ? sumaBajo160 / contadorBajo160 : 0;

    System.out.println("El promedio de estaturas en general es: " + promedioTotal + " metros.");
    System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + promedioBajo160 + " metros.");
    }
    
}
