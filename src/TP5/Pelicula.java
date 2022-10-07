package TP5;

public class Pelicula {
	private static int nroPeli = 0;
	private final int id;
    private String nombrePelicula;
    private Categoria categoria;

    public Pelicula(){
    	nroPeli ++;
    	this.id = nroPeli;
    	this.nombrePelicula = "";
    	categoria = new Categoria();
    }
    
    public Pelicula(String nombrePelicula, Categoria categoria) {
        nroPeli ++;
        this.id = nroPeli;
        this.nombrePelicula = nombrePelicula;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
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
