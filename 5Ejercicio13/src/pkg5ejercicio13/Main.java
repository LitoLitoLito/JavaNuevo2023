/*
Crea un vector llamado ‘Equipo’ cuya dimensión 
sea la cantidad de compañeros de equipo y define 
su tipo de dato de tal manera que te permita 
alojar sus nombres más adelante.
 */
package pkg5ejercicio13;

public class Main {

    public static void main(String[] args) {
        String [][] matriz  = new String [3][3];
        
// Puedo asignar valores de esta manera
        matriz[0][0] = "A";

     // Asigno valores mediante el For
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             matriz[i][j] = "A";
         }
     }

     // Muestro la matriz
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {

         System.out.print("[" + matriz[i][j] + "]");  

         }
         System.out.println("");
    }
    
}
}