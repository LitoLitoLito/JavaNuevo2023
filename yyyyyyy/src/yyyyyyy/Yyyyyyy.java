/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yyyyyyy;

import java.util.Random;

/**
 *
 * @author litit
 */
public class Yyyyyyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[][] = new int[4][4];
         Random aleatorio = new Random();
         
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                    matriz[i][j] = aleatorio.nextInt(10);
                    System.out.print(matriz[i][j] +"\t");
                    
             }
             System.out.println(" ");
         }
         System.out.println("La transpuesta es:");
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                    System.out.print(matriz[j][i] +"\t");
                    
             }
             System.out.println(" ");
    }
    
    }
}
