package UT1.ejercicios3;

/*
Mostrar la tabla de multiplicar de un número.
*/

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un número: ");

        int numero = scanner.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");

        System.out.println(numero);
        System.out.println(numero + numero);
        System.out.println(numero + numero + numero);
        System.out.println(numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero + numero + numero + numero + numero);
        System.out.println(numero + numero + numero + numero + numero + numero + numero + numero + numero + numero);

        scanner.close();
    }
}
