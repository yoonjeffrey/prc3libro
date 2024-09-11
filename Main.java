import practica3LIBRO.Biblioteca;
import practica3LIBRO.Libro;
import practica3LIBRO.Autor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor(1, "Erich Fromm", "erich.fromm@example.com");
        Autor autor2 = new Autor(2, "Gabriel García Márquez", "garcia.marquez@example.com");
        Autor autor3 = new Autor(3, "George Orwell", "george.orwell@example.com");

        Libro libro1 = new Libro("El Arte de Amar", autor1, 1956, "9780060802912");
        Libro libro2 = new Libro("Cien Años de Soledad", autor2, 1967, "9780060883287");
        Libro libro3 = new Libro("1984", autor3, 2021, "9780451524935");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        libro1.setPrestado(true);  

        System.out.println("Información de todos los libros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            mostrarInformacionLibro(libro);
        }

        // Mostrar libros prestados
        System.out.println("\nLibros prestados:");
        ArrayList<Libro> librosPrestados = biblioteca.obtenerLibrosPrestados();
        for (Libro libro : librosPrestados) {
            mostrarInformacionLibro(libro);
        }

        // Mostrar libros no prestados
        System.out.println("\nLibros no prestados:");
        ArrayList<Libro> librosNoPrestados = biblioteca.obtenerLibrosNoPrestados();
        for (Libro libro : librosNoPrestados) {
            mostrarInformacionLibro(libro);
        }
    }

    public static void mostrarInformacionLibro(Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Correo del Autor: " + libro.getAutor().getCorreoElectronico());
        System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Prestado: " + (libro.isPrestado() ? "Sí" : "No"));
        System.out.println("Es Antiguo: " + (libro.esAntiguo() ? "Sí" : "No"));
        System.out.println("------------------------");
    }
}