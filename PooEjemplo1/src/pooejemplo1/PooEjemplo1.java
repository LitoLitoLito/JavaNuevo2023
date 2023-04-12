/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejemplo1;

import Entidad.Persona;

/**
 *
 * @author Julio Acuña
 */
public class PooEjemplo1 {

    public static void main(String[] args) {
        
        // Instanciación utilizando el constructor vacío
        Persona persona1 = new Persona();
        Persona persona3 = new Persona();
        
        // Instanciación utilizando el constructor por parámetro
        Persona persona2 = new Persona("Julio", "Acuña", 1.65 );
        Persona persona4 = new Persona("Fidela", "Sosa", 1.70 );
        
        // System.out.println(persona2.getNombre() + " " + persona2.getApellido() + ".  Estatura --> " + persona2.getEstatura());
        
        // persona2.setNombre("Ceferino");
        
        // System.out.println(persona2.getNombre() + " " + persona2.getApellido() + ".  Estatura --> " + persona2.getEstatura());
        
       persona1.setNombre("Juan");
       persona1.setApellido("Zamora");
       persona1.setEstatura(1.80);
       
       // System.out.println(persona1.getNombre() + " " + persona1.getApellido() + ".  Estatura --> " + persona1.getEstatura());
    
       persona3.setNombre("Silvia");
       persona3.setApellido("Tolaba");
       persona3.setEstatura(1.68);
       
       // System.out.println(persona3.getNombre() + " " + persona3.getApellido() + ".  Estatura --> " + persona3.getEstatura());
       
       // System.out.println(persona4.getNombre() + " " + persona4.getApellido() + ".  Estatura --> " + persona4.getEstatura());
      
       System.out.println("");
       System.out.println("");
       Persona.mostrarAtributos(persona1);
       System.out.println("");
       Persona.mostrarAtributos(persona2);
       System.out.println("");
       Persona.mostrarAtributos(persona3);
       System.out.println("");
       Persona.mostrarAtributos(persona4);
       System.out.println("");
    }
    
    
    
}
