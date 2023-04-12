/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author litit
 */
public class cuenta {
    public double saldo;
    public String titular;

    public cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No tienes suficiente saldo para realizar esta transacción.");
        } else {
            saldo -= cantidad;
            if (saldo < 0) {
                saldo = 0;
            }
            System.out.println("Retiro exitoso. Saldo disponible: " + saldo);
        }
    }
}

