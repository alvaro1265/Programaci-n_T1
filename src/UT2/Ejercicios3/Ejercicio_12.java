package UT2.Ejercicios3;

/*
Crea un metodo mostrar para imprimir: un String, un int, un double.
*/

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String palabra = scanner.next();
        System.out.println("Ingresa un numero entero");
        int numero = scanner.nextInt();
        System.out.println("Ingresa un numero con decimales");
        double numero2 = scanner.nextDouble();

        scanner.close();

        mostrar(palabra);
        mostrar(numero);
        mostrar(numero2);
    }

    static void mostrar(String a) {
        System.out.println("Palabra: " + a);
    }

    static void mostrar(int b) {
        System.out.println("Numero entero: " + b);
    }

    static void mostrar(double c) {
        System.out.println("Numero decimal: " + c);
    }
}
