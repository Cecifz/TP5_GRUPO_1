package TP5;

public class Pelicula {
	private static int nroPeli = 0;
	private static int id;
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

    public void setCategoria(int Cat,String NombreCat) {
    	
        this.categoria.setId(Cat);
        this.categoria.setNombreCategoria(NombreCat);
    }

    static int proximoID() {
        return id + 1;
    }

    @Override
    public String toString() {
        return "Categoria : Id = " + id + ", Nombre = " + nombrePelicula + ", Categoria = " + categoria;
    }
}
