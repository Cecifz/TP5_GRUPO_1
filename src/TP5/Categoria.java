package TP5;

import javax.print.DocFlavor;

public class Categoria {
    private int id;
    private String nombreCategoria;

    public Categoria() { }

    public Categoria(int id) {
        this.id = id;
        switch(id) {
        case 1:
        	nombreCategoria= "Terror";
        	break;
        case 2:
        	nombreCategoria= "Accion";        	
        	break;
        case 3:
        	nombreCategoria= "Suspenso";
        	break;
        case 4:
        	nombreCategoria= "Romantica";
        	break;
        }
        
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
