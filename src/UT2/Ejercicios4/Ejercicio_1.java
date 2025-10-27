package UT2.Ejercicios4;

/*
Implementa un metodo recursivo que determine si un número es primo.
*/

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int primos = scanner.nextInt();
        int primos5 = primos(1);
        System.out.println(primos);
        scanner.close();
        System.out.println(primos5);
    }
    static int primos (int numero) {
        if (numero == 1) {
            return 1;
        } else {
            System.out.println("Es primo");
            return numero * primos(primos(+primos(+41)));
        }
    }
}
