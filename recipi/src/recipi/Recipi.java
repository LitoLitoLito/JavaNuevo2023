/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipi;

/**
 *
 * @author litit
 */
public class Recipi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digitos = 0;
        int n = 1234;
        
    System.out.println("");
    System.out.println("Número Inicial --- > " + n);
     System.out.println("");
        
        
    while (n > 0) {
        n /= 10;
        
        digitos++;
        System.out.println(n);
        
    }
    System.out.println("");
    System.out.println("Digitos ---> " + digitos);
}
}
