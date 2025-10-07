package UT2.Ejercicios1;

/*
Programa que lea dos números por teclado y muestre el resultado de la división del primero por el segundo.
Se debe comprobar que el divisor no puede ser cero.
*/

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int denominador = scanner.nextInt();
        if (denominador != 0) {
            System.out.println("El resultado es: " + (numero / denominador));
        } else {
            System.out.println("No se puede dividir entre 0");
        }
        scanner.close();
    }
}
