/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al 
usuario los dos números y los ingresa en los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. 
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Puntoss;

import java.util.Scanner;

/**
 *
 * @author Julio Acuña
 */
public class Puntos {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constructor vacío
    public Puntos() {
    }

    // Constructor con parámetros
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Método para crear los puntos ingresando los valores desde consola
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de x1: ");
        this.x1 = leer.nextDouble();

        System.out.println("Ingrese el valor de y1: ");
        this.y1 = leer.nextDouble();

        System.out.println("Ingrese el valor de x2: ");
        this.x2 = leer.nextDouble();

        System.out.println("Ingrese el valor de y2: ");
        this.y2 = leer.nextDouble();
    }

    // Método para calcular y devolver la distancia entre los dos puntos
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
