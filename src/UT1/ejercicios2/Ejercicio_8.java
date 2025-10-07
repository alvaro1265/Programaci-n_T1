package UT1.ejercicios2;

/*
Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 */

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de tres cifras: ");
        int numerop = scanner.nextInt();
        System.out.println((numerop / 100) + " " + (numerop / 10 % 10) + " " + (numerop % 10));
    }
}
