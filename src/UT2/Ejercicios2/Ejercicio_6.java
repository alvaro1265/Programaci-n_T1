package UT2.Ejercicios2;

/*
Realiza una aplicación que nos pida un número de ventas a introducir,
después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
*/

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas ventas vas a registrar:");
        int ventas = scanner.nextInt();
        double resultado = 0;
        for (int i = 0; i < ventas; i++) {
            System.out.println("Precio de venta " + (i + 1) + ":");
            double precio = scanner.nextDouble();
            resultado += precio;
        }
        System.out.println("Resultado: " + resultado + " €");
        scanner.close();
    }
}
