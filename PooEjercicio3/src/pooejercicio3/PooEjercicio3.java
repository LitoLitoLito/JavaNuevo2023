/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio3;

import Operaciones.Operacion;

/**
 *
 * @author litit
 */
public class PooEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion operacion1 = new Operacion();
        
        
        operacion1.crearOperacion();
        System.out.println("La suma es: " + operacion1.sumar());
        System.out.println("La resta es: " + operacion1.restar());
        System.out.println("La multiplicación es: " + operacion1.multiplicar());
        System.out.println("La división es: " + operacion1.dividir());

    }
    
}
