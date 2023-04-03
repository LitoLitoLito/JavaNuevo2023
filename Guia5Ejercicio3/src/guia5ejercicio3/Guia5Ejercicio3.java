/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package guia5ejercicio3;

public class Guia5Ejercicio3 {

    public static void main(String[] args) {

        int[] numeros = { 1, 12, 123};
        int[] contador = new int[6]; 

    for (int i = 0; i < numeros.length; i++) {
        int numDigitos = ContarDigitos(numeros[i]);
        if (numDigitos > 5) {
            numDigitos = 5;
        }
        contador[numDigitos]++;
        System.out.println(contador[numDigitos]);
    }


    for (int i = 1; i <= 5; i++) {
        System.out.println("Numeros de " + i + " digitos: " + contador[i]);
    }

    }
 
    public static int ContarDigitos(int n) {
    int digitos = 0;
    while (n > 0) {
        n /= 10;
        digitos++;
    }
    return digitos;
}
}
