/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import cuentas.cuenta;

/**
 *
 * @author litit
 */
public class PooExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crear una nueva cuenta con un saldo inicial de 1000.0 y un titular llamado "Juan"
    cuenta cuentaJuan = new cuenta("Juan", 1000.0);
    
    // Obtener el saldo actual de la cuenta
    double saldoActual = cuentaJuan.obtenerSaldo();
    System.out.println("El saldo actual de la cuenta de " + cuentaJuan.titular + " es " + saldoActual);
    
    // Retirar 500.0 de la cuenta
    cuentaJuan.retirarDinero(500.0);
    
    // Obtener el saldo actualizado de la cuenta
    saldoActual = cuentaJuan.obtenerSaldo();
    System.out.println("El saldo actual de la cuenta de " + cuentaJuan.titular + " es " + saldoActual);
    
    // Intentar retirar 700.0 de la cuenta (lo cual no debería ser posible)
    cuentaJuan.retirarDinero(700.0);
}
        
    }
    

