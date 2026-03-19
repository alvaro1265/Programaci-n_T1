package UT5.ejercicios3;

import java.util.UUID;

public class Videojuego {

    private String titulo;
    private String plataforma;
    private String genero;
    private int precio;
    private int stock;
    private UUID codigoIdentificador;


    public Videojuego(String titulo, String plataforma, String genero, int precio, int stock) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigoIdentificador = UUID.randomUUID();
    }



    public void venderUnidad() {
        if (stock > 0) {
            stock --;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public UUID getCodigoIdentificador() {
        return codigoIdentificador;
    }
}
