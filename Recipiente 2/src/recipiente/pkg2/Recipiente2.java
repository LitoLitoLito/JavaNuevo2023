/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipiente.pkg2;

import java.util.Scanner;

/**
 *
 * @author litit
 */
public class Recipiente2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num1;
        int num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1= leer.nextInt();
        System.out.println("ingrese otro numero");
        num2= leer.nextInt();
        
        if (num1 > 25 && num2 > 25){
        System.out.println("ambos numeros ingresados son mayores a 25");
        }else if (num1 > 25){
        System.out.println("solo el primer numero ingresado es mayor a 25");
        }else if (num2 > 25){
        System.out.println("solo el segundo numero ingresado es mayor a 25");    
        }else{
        System.out.println("ninguno de los numeros es mayor a 25");    
        }
    }
    }
    

