/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).
 */
package matrizantisimetrica;

/**
 *
 * @author litit
 */
public class MatrizAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      int matriz[][] = {{0, -2, 5}, //  0,  2, -4
                        {2, 0, 2}, //   -2, 0, -2
                        {-4, -2,0}}; // 4,  2, 0
      
      
      int filas = matriz.length;
      int columnas = matriz[0].length;

      int traspuesta[][] = new int[columnas][filas];

      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            traspuesta[j][i] = matriz[i][j];
         }
      }

      boolean esAntisimetrica = true;
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            if (matriz[i][j] != -1 * traspuesta[i][j]) { // 2 != -2
               esAntisimetrica = false;
               break;
            }
         }
      }

      if (esAntisimetrica) {
         System.out.println("La matriz es antisimétrica");
      } else {
         System.out.println("La matriz no es antisimétrica");
      }
      
      
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             System.out.print(matriz[i][j]+"\t");
         }
         System.out.println();
      }
      
        System.out.println("");
      System.out.println("Transpuesta");
      for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             System.out.print(traspuesta[i][j]+"\t");
         }
         System.out.println();
      }
         
      
      
    }
    
    
}
