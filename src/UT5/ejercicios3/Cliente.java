package UT5.ejercicios3;

import java.util.UUID;

public class Cliente {

    private String titulo;
    private String apellidos;
    private String direccion;
    private String email;
    private UUID codigoCliente;


    public Cliente(String titulo, String apellidos, String direccion, String email) {
        this.titulo = titulo;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.codigoCliente = UUID.randomUUID();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }
}
