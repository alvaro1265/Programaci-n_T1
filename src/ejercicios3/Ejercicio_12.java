package ejercicios3;

/*
Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
El IVA será una constante del 21%.
*/

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.21;

        System.out.println("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("El precio con IVA es: " + (precio * (1 + IVA)));
    }
}
