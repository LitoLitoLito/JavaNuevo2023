/*
Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package eurosaotrasmonedas;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class EurosAOtrasMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros que quieres convertir: ");
        double euros = leer.nextDouble();

        System.out.println("Introduce la moneda a la que quieres convertir");
        System.out.println(" libras");
        System.out.println(" dólares");
        System.out.println(" yenes");
        String moneda = leer.next();

        ConvertirMoneda(euros, moneda);
    }

    public static void ConvertirMoneda(double euros, String moneda) {
        double cambio = 0.0;
        String simbolo = "";

        switch (moneda) {
            case "libras":
                cambio = 0.86;
                simbolo = "£";
                break;
            case "dólares":
                cambio = 1.28611;
                simbolo = "$";
                break;
            case "yenes":
                cambio = 129.852;
                simbolo = "¥";
                break;
            default:
                System.out.println("Moneda no reconocida");
                return;
        }

        double cantidadConvertida = euros * cambio;
        System.out.println(euros + "€ son " + cantidadConvertida + simbolo);
    }
    
}
