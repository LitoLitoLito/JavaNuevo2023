/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(Systen.in); 
        String nombre;
        System.out.println("Ingresa tu nombre ");
        nombre = leer.next();
        System.out.println("Hola Mundo Soy " + nombre + " y estoy aprendiendo en Java");
        
        System.out.println("Hola Mundo");
    }
    
}