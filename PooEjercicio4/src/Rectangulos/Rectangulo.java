/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Rectangulos;

import java.util.Scanner;

/**
 *
 * @author Julio Acuña
 */
public class Rectangulo {

private double base;
    private double altura;

    // Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Constructor sin parámetros
    public Rectangulo() {
    }

    // Getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = leer.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = leer.nextDouble();
        
    }

    // Superficie
    public double calcularSuperficie() {
        return this.base * this.altura;
    }

    // Perímetro
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }

    // Dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("* ");

                } else{
                    if (j == 0 || j == base - 1) {
                        System.out.print("* ");
                    }
                     else {
                        System.out.print("  ");
    }
                    

                }  
            }
            System.out.println();
        }
        
    }
}