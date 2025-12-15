package UT3.libreria;

public class intro {
    private String titulo;
    private String autor;
    private String anyoDePublicacion;
    private String isbn;

    public intro(String titulo, String isbn, String anyoDePublicacion, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anyoDePublicacion = anyoDePublicacion;
        this.autor = autor;
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

    public String getAnyoDePublicacion() {
        return anyoDePublicacion;
    }

    public void setAnyoDePublicacion(String anyoDePublicacion) {
        this.anyoDePublicacion = anyoDePublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "El libro es " + titulo + " de " + autor + " publicado en el año " + anyoDePublicacion + " con el ISBN " + isbn;
    }
}
