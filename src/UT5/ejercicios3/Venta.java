package UT5.ejercicios3;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    Cliente clientes;
    List<Videojuego> videojuego;
    private LocalDate fechaVenta;

    public Venta(Cliente clientes, List<Videojuego> videojuego, LocalDate fechaVenta) {
        this.clientes = clientes;
        this.videojuego = videojuego;
        this.fechaVenta = fechaVenta;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public List<Videojuego> getVideojuego() {
        return videojuego;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }
}
