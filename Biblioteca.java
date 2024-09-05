package practica3LIBRO;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    
    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInformacion();
            System.out.println(); 
        }
    }

    
    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro con el título \"" + titulo + "\" no se encontró en la biblioteca.");
        }
    }
}
