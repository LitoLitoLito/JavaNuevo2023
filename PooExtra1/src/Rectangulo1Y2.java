/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
y imprime el área del rectángulo.
 */

/**
 *
 * @author litit
 */
class Rectangulo1Y2 {
    
    private int lado1;
    private int lado2;
    
    

    public Rectangulo1Y2(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcular_area() {
        return lado1 * lado2;
    }
}
