/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package codificarfrase;

import java.util.Scanner;


public class CodificarFrase {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase (terminada en punto): ");
        String entrada = leer.nextLine();

        String codificado = codificarVocales(entrada);

        System.out.println("Palabra o frase codificada: " + codificado);
    }

    public static String codificarVocales(String entrada) {
        String codificado = "";

        for (int i = 0; i < entrada.length(); i++) {
            char caracter = entrada.charAt(i);

            switch (caracter) {
                case 'a':
                case 'A':
                    codificado += '@';
                    break;
                case 'e':
                case 'E':
                    codificado += '#';
                    break;
                case 'i':
                case 'I':
                    codificado += '$';
                    break;
                case 'o':
                case 'O':
                    codificado += '%';
                    break;
                case 'u':
                case 'U':
                    codificado += '*';
                    break;
                default:
                    codificado += caracter;
                    break;
            }
        }

        return codificado;
    }
    
}
