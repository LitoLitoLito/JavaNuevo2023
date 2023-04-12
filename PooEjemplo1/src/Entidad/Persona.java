/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Julio Acuña
 */
public class Persona {

    private String nombre;
    private String apellido;
    private double estatura;

    public Persona() {
    }

    public Persona(String nombre, String apellido, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public static void mostrarAtributos(Persona persona) {

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Estatura: " + persona.getEstatura());

    }

}
