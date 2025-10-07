package UT1.ejercicios3;

/*
Desarrolla un programa que compruebe si un número introducido por teclado es múltiplo de 7.
 */

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        int numero = scanner.nextInt();
        System.out.println((numero % 7 == 0) ? "Es multiplo de 7" : "No es multiplo de 7");
        scanner.close();
    }
}
