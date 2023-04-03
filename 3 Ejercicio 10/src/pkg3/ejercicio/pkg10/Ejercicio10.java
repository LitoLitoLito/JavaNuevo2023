/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package pkg3.ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int numIngresado=0;
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        
        for(int i=0;i<4;i++){
            while (numIngresado>20 && numIngresado == 0){
            System.out.println("Error tiene que ser un número entre 1 y 20");
            Scanner leer = new Scanner(System.in);
            numIngresado = leer.nextInt();
            }
            System.out.println("Ingrese un numero entre 1 y 20");
            Scanner leer = new Scanner(System.in);
            numIngresado = leer.nextInt();
            if(i==0){
                num1=numIngresado;
                numIngresado=0;
            } else if (i==1) {
                num2=numIngresado;
                numIngresado=0;
            }else if (i==2) {
                num3=numIngresado;
                numIngresado=0;
            }else if (i==3) {
                num4=numIngresado;
                numIngresado=0;
            }
            
            
        
        
            
        }
        System.out.println("");
        System.out.print(num1 + " ");
        for(int j=0; j<num1;j++){
                System.out.print(" *");
                }
        System.out.println("");
        System.out.print(num2 + " ");
        for(int j=0; j<num2;j++){
                System.out.print(" *");
                }
        System.out.println("");
        System.out.print(num3 + " ");
        for(int j=0; j<num3;j++){
                System.out.print(" *");
                }
        System.out.println("");
        System.out.print(num4 + " ");
        for(int j=0; j<num4;j++){
                System.out.print(" *");
                }
        
        System.out.println("");
        
    }
    

}
