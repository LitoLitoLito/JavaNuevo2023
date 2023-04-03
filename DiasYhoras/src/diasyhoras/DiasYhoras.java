/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
 */
package diasyhoras;

import java.util.Scanner;

public class DiasYhoras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = leer.nextInt();
        
        int dias = minutos / 1440;  // 1440 minutos por día
        int horas = (minutos % 1440) / 60;  // 60 minutos por hora
        
        
        System.out.println(minutos + " minutos son equivalentes a:");
        System.out.println(dias + " días, " + horas + " horas");
    }
    }
    

