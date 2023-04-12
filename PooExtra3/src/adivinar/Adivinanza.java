/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinar;

import java.util.Scanner;

/**
 *
 * @author litit
 */

    import java.util.Scanner;

public class Adivinanza {
    private int jugador1_ganadas;
    private int jugador2_ganadas;

    public Adivinanza() {
        jugador1_ganadas = 0;
        jugador2_ganadas = 0;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        int numero_secreto, intentos_maximos, intentos_restantes, intento;
        boolean jugador1 = true;
        String nombre_jugador1, nombre_jugador2, mensaje_pista;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.print("Ingrese el nombre del primer jugador: ");
        nombre_jugador1 = leer.nextLine();
        System.out.print("Ingrese el nombre del segundo jugador: ");
        nombre_jugador2 = leer.nextLine();

        while (true) {
            System.out.print(nombre_jugador1 + ", por favor ingrese el número secreto: ");
            numero_secreto = leer.nextInt();
            System.out.print("Ingrese el número máximo de intentos: ");
            intentos_maximos = leer.nextInt();
            intentos_restantes = intentos_maximos;

            while (intentos_restantes > -1) {
                System.out.print(nombre_jugador2 + ", adivine el número secreto (le quedan " + intentos_restantes + " intentos): ");
                intento = leer.nextInt();
                intentos_restantes--;

                if (intento == numero_secreto) {
                    System.out.println("¡Felicidades, " + nombre_jugador2 + "! Adivinaste " + (intentos_maximos - intentos_restantes) + " intentos.");
                    if (jugador1) {
                        jugador1_ganadas++;
                    } else {
                        jugador2_ganadas++;
                    }
                    break;
                } else if (intento > numero_secreto) {
                    mensaje_pista = "más bajo";
                } else {
                    mensaje_pista = "más alto";
                }

                System.out.println("Número incorrecto. " + mensaje_pista + ".");
            }

            if (intentos_restantes == 0) {
                System.out.println("Lo siento, " + nombre_jugador2 + ". Se te acabaron los intentos. El número secreto era " + numero_secreto + ".");
                if (jugador1) {
                    jugador2_ganadas++;
                } else {
                    jugador1_ganadas++;
                }
            }

            System.out.println("Marcador actual: " + nombre_jugador1 + " (" + jugador1_ganadas + ") - " + nombre_jugador2 + " (" + jugador2_ganadas + ")");

            System.out.print("¿Desean jugar otra vez? (s/n): ");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }

            jugador1 = !jugador1;
        }
    }
}

