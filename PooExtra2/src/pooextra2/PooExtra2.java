/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Puntoss.Puntos;

/**
 *
 * @author litit
 */
public class PooExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los puntos es: " + distancia);
    }

}
    
