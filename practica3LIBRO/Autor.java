package practica3LIBRO;

public class Autor {
    private int id;
    private String nombre;
    private String correoElectronico;

    public Autor(int id, String nombre, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}

