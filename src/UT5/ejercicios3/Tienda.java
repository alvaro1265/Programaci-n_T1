package UT5.ejercicios3;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    List<Videojuego> inventario = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Venta> ventas = new ArrayList<>();

    public void anadirVideojuego (Videojuego videojuego) {
        inventario.add(videojuego);
    }

    public void mostrarInventario() {
        for (Videojuego videojuego : inventario) {
            System.out.println(videojuego);
        }
    }

    public Videojuego consultaProducto(String titulo) {

        for (Videojuego videojuego : inventario) {
            if (videojuego.getTitulo().equalsIgnoreCase(titulo)) {
                return videojuego;
            }
        }
        return null;
    }

    public void consultarStock(String titulo) {
        Videojuego videojuego = consultaProducto(titulo);
        if (videojuego != null) {
            System.out.println("Stock: " + videojuego.getStock());
        } else {
            System.out.println("Juego no encontrado");
        }
    }

    public Cliente buscarCliente(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigoCliente().equals(codigo)) {
                return cliente;
            }
        }
        return null;
    }

    public void registrarVenta(int codigoCliente, List<Videojuego> juegos) {
        for (Videojuego videojuego : juegos) {
            if (videojuego.getStock() > 0) {
                videojuego.venderUnidad();
            } else {
                System.out.println("Sin stock de " + videojuego.getTitulo());
            }
        }
        Cliente cliente = buscarCliente(codigoCliente);
        if (cliente != null) {
            Venta venta = new Venta(cliente, juegos, LocalDate.now());
            ventas.add(venta);
        }
    }

    public void mostrarVentas() {
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }

    public void ventasPorFecha(LocalDate fecha) {
        for (Venta v : ventas) {
            if (v.getFechaVenta().equals(fecha)) {
                System.out.println(v);
            }
        }
    }
}
