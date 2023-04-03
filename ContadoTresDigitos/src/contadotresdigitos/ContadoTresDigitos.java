/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 
lo sustituya por una E. Ejemplo:
 */
package contadotresdigitos;

/**
 *
 * @author litit
 */
public class ContadoTresDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   for (int i = 0; i <= 333; i++) {
            String numero = String.format("%03d", i); // Convertir a cadena con 3 dígitos
            numero = numero.replace("3", "E"); // Reemplazar "3" por "E"
            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
        }
    }
    
}
