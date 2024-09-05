import practica3LIBRO.Biblioteca;
import practica3LIBRO.Libro;

public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("El Arte de Amar", "Erich Fromm", 1956, "9780060802912");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "9780060883287");
        Libro libro3 = new Libro("2021", "George Orwell", 2021, "9780451524935");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Información de los libros en la biblioteca:");
        biblioteca.mostrarLibros();

        String tituloBuscado = "1984";
        System.out.println("\nBuscar libro con el título \"" + tituloBuscado + "\":");
        biblioteca.buscarLibroPorTitulo(tituloBuscado);

  
    }
}
