package TP5;

public class Pelicula {
    private int id;
    private String nombrePelicula;
    private Categoria categoria;

    public Pelicula() { }

    public Pelicula(int id, String nombrePelicula, Categoria categoria) {
        this.id = id;
        this.nombrePelicula = nombrePelicula;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categoria : Id = " + id + ", Nombre = " + nombrePelicula + ", Categoria = " + categoria;
    }
}
