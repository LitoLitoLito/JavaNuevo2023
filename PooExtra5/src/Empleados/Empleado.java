/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Empleados;

/**
 *
 * @author litit
 */
public class Empleado {
 
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void calcular_aumento() {
        if (edad > 30) {
            this.salario *= 1.1;
            System.out.println("");
            System.out.println("Empleado con 10 % ");
        } else {
            this.salario *= 1.05; 
            System.out.println("");
            System.out.println("Empleado con 5 % ");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getSalario() {
        return this.salario;
    }

    
}  

