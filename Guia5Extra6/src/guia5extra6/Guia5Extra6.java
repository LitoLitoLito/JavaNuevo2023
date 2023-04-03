/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package guia5extra6;


import java.util.Random;
import java.util.Scanner;


public class Guia5Extra6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pedir al usuario que ingrese las 5 palabras
        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("Ingrese la palabra %d (de 3 a 5 caracteres): ", i + 1);
            String palabra = sc.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.printf("Ingrese la palabra %d (de 3 a 5 caracteres): ", i + 1);
                palabra = sc.nextLine();
            }
            palabras[i] = palabra.toUpperCase();
        }

        // Crear la sopa de letras
        char[][] sopa = new char[20][20];
        int filaSeleccionada = rand.nextInt(20); // Seleccionar una fila aleatoria
        int columnaActual = rand.nextInt(16); // Seleccionar una columna aleatoria para la primera palabra
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopa[filaSeleccionada][columnaActual + i] = palabra.charAt(i);
            }
            columnaActual += palabra.length() + 1; // Dejar un espacio entre cada palabra
        }

        // Rellenar los espacios vacíos con números aleatorios del 0 al 9
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == 0) {
                    sopa[i][j] = (char) (rand.nextInt(10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}