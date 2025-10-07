package UT1.ejercicios3;

/*
Programa que lea dos caracteres por teclado y compruebe si son iguales.
 */

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");

        char letra = scanner.nextLine().charAt(0);
        System.out.println("Ingrese un caracter: ");

        char caracter = scanner.nextLine().charAt(0);
        System.out.println((caracter == letra) ? "Son iguales" : "No son iguales");
        scanner.close();
    }
}
