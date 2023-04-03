/*
Los profesores del curso de programación de Egg necesitan 
llevar un registro de las notas adquiridas por sus 10 alumnos 
para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 
2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y 
se guarda en el arreglo. Al final del programa los profesores 
necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio 
mayor o igual al 7 de sus notas del curso.

 */
package guia5extra4;

import java.util.Scanner;

public class Guia5Extra4 {

    public static void main(String[] args) {
        int cantidadAlumnos = 2;
        Scanner leer = new Scanner(System.in);
        double[][] notas = new double[cantidadAlumnos][4];
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0, desaprobados = 0;

        // Solicitar notas de los alumnos
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            System.out.print("Primer trabajo práctico evaluativo: ");
            notas[i][0] = leer.nextDouble() * 0.1;
            System.out.println(notas[i][0]);
            System.out.print("Segundo trabajo práctico evaluativo: ");
            notas[i][1] = leer.nextDouble() * 0.15;
            System.out.println(notas[i][1]);
            System.out.print("Primer Integrador: ");
            notas[i][2] = leer.nextDouble() * 0.25;
            System.out.println(notas[i][2]);
            System.out.print("Segundo Integrador: ");
            notas[i][3] = leer.nextDouble() * 0.5;
            System.out.println(notas[i][3]);

            // Calcular promedio
            promedios[i] = notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3];
        }

        // Contar aprobados y desaprobados
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (promedios[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Imprimir resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

    }

}
