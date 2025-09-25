package Introducción;

public class PrecioVideojuego {
    public static void main(String[] args) {
        double ahorros = 80;
        double preciovideojuego1 = 79.90;

        System.out.println("Tengo " + ahorros + "€ ahorrado");
        System.out.println("Me voy a comprar un videojuego que cuesta " + preciovideojuego1 + "€");

        ahorros = ahorros - preciovideojuego1;

        System.out.println("Queda " + ahorros + "€");

    }
}
