package UT1.ejercicios3;

/*
Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
Se debe comprobar que el divisor no puede ser cero.
 */

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");

        double numero = scanner.nextDouble();
        System.out.println("Ingrese un número: ");

        double num = scanner.nextDouble();
        System.out.println("Resultado: " + (numero / num));
        System.out.println((num != 0) ? "" : "No se puede dividir por 0");



    }
}
