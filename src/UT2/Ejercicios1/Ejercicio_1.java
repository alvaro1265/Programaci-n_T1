package UT2.Ejercicios1;

/*
Programa Java que lea un número entero y calcule si es par o impar.
*/

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        scanner.close();
    }
}
