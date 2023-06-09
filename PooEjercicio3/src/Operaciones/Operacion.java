/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author Julio Acuña
 */
public class Operacion {
private double numero1;
    private double numero2;
    
    // Constructor con todos los atributos pasados por parámetro
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
    
    }
    
    // Métodos getters y setters
    public double getNumero1() {
        return numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    // Método para crear una operación, pide al usuario los dos números y los guarda en los atributos del objeto
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        setNumero1(leer.nextDouble());
        System.out.print("Introduce el segundo número: ");
        setNumero2(leer.nextDouble());
    }
    
    // Método para calcular la suma de los números y devolver el resultado al main
    public double sumar() {
        return numero1 + numero2;
    }
    
    // Método para calcular la resta de los números y devolver el resultado al main
    public double restar() {
        return numero1 - numero2;
    }
    
    // Método para hacer la multiplicación de los números y devolver el resultado al main
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    // Método para hacer la división de los números y devolver el resultado al main
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: no se puede dividir por cero");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}
