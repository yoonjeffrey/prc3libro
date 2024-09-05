package practica3LIBRO;
/**
 * Jeffrey Yoon 1196854
 * 4 de Septiembre del 2024
 */
public class Libro {
    // Atributos de instancia
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro() {
        this.titulo = "El Arte de Amar";
        this.autor = "Erich Fromm";
        this.añoPublicacion = 1956;
        this.isbn = "9780060802912";
    }

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("ISBN: " + isbn);
        if (esAntiguo()) {
            System.out.println("El libro es antiguo.");
        } else {
            System.out.println("El libro no es antiguo.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean esAntiguo() {
        int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return (añoActual - añoPublicacion) > 20;
    }

   
}


        


