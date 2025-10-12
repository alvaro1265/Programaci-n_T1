package UT2.Ejercicios1;

/*
Escribir un programa en Java que lea un número entero por el teclado e imprima todos los números impares menores que él.
*/

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
