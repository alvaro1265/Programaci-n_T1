package UT5.ejercicios3;

import UT5.ejercicios2.Cliente;

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

    public void consultaProducto() {

    }
}
