package UT1.ejercicios3;

/*
Programa Java que lea un número entero y calcule si es par o impar.
 */

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();
        System.out.println("Tu numero es: " + ((numero % 2 == 0) ? "par " : "impar"));

        scanner.close();

    }
}
