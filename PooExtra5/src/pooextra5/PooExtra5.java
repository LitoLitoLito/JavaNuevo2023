/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package pooextra5;

import Empleados.Empleado;

/**
 *
 * @author litit
 */
public class PooExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Empleado empleado1 = new Empleado("Juan", 25, 1000);
        empleado1.calcular_aumento();
        System.out.println("Nombre ---> " + empleado1.getNombre());
        System.out.println("Edad ---> " + empleado1.getEdad());
        System.out.println("Salario ---> " + empleado1.getSalario());

        Empleado empleado2 = new Empleado("María", 35, 1000);
        empleado2.calcular_aumento();
        System.out.println("Nombre ---> " + empleado2.getNombre());
        System.out.println("Edad ---> " + empleado2.getEdad());
        System.out.println("Salario ---> " + empleado2.getSalario());
    }
    }
    

