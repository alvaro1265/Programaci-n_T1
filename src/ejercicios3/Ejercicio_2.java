package ejercicios3;

/*
Programa que lea un número entero y muestre si el número es múltiplo de 10.
 */

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero");

        int numero = scanner.nextInt();
        System.out.println((numero % 10 == 0) ? "Es multiplo de 10 " : "No es multiplo de 10 ");
    }
}
