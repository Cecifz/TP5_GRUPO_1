package TP5;

import javax.print.DocFlavor;

public class Categoria {
    private int id;
    private String nombreCategoria;

    public Categoria() { }

    public Categoria(int id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return nombreCategoria;
    }
}
