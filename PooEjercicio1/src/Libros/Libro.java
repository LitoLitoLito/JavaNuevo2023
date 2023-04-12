/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.
 */
package Libros;
import java.util.Scanner;
/**
 *
 * @author Julio Acuña
 */
public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor con todos los atributos
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor vacío
    public Libro() {
    }

    // Método para cargar un libro
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }

    // Método para imprimir los datos del libro
    public void imprimirDatosLibro() {
        System.out.println("Número de ISBN: " + this.ISBN);
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("Número de páginas del libro: " + this.numPaginas);
    }
}

