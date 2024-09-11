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

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Libro> obtenerLibrosPrestados() {
        ArrayList<Libro> librosPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado()) {
                librosPrestados.add(libro);
            }
        }
        return librosPrestados;
    }

    public ArrayList<Libro> obtenerLibrosNoPrestados() {
        ArrayList<Libro> librosNoPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                librosNoPrestados.add(libro);
            }
        }
        return librosNoPrestados;
    }
}

