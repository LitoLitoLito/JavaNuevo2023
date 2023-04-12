/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entida6;

/**
 *
 * @author litit
 */
public class Rectangulo6 {
        private int lado1;
    private int lado2;
    
    

    public Rectangulo6(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcular_area() {
        return lado1 * lado2;
    }
}

