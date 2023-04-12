/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio2;

import Circunferencias.Circunferencia;

/**
 *
 * @author Julio Acuña
 */
public class PooEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia circ = new Circunferencia(0); 
        
        
        
        // circ.setRadio(4.2); 
        // System.out.println("Nuevo radio de la circunferencia: " + circ.getRadio());
        
        circ.crearCircunferencia(3.5); 
        // System.out.println("Radio de la nueva circunferencia: " + circ.getRadio());
        
        
        System.out.println("Radio de la circunferencia: " + circ.getRadio());
        System.out.println("Área de la circunferencia: " + circ.area());
        System.out.println("Perímetro de la circunferencia: " + circ.perimetro());
        
        
    }
    
}
