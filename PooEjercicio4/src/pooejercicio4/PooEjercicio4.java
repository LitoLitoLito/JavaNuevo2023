/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio4;

import Rectangulos.Rectangulo;

/**
 *
 * @author Julio Acuña
 */
public class PooEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo();
        Rectangulo rectangulo1 = new Rectangulo();
        
        rectangulo.crearRectangulo();
        System.out.println("");
        System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
        System.out.println("");
        System.out.println("El rectángulo dibujado con asteriscos:");
        rectangulo.dibujarRectangulo();
        System.out.println("");
        
        
        
        
        rectangulo1.crearRectangulo();
        System.out.println("");
        System.out.println("La superficie del rectángulo es: " + rectangulo1.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
        System.out.println("");
        System.out.println("El rectángulo dibujado con asteriscos:");
        rectangulo1.dibujarRectangulo();
        System.out.println("");
}
    
}
