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

        scanner.close();

        boolean resultado = primos(primos, 2);
        if (resultado) {
            System.out.println(primos + " Es primo");
        } else {
            System.out.println(primos + " No es primo");
        }
    }
    static boolean primos (int n, int i) {
        if (n <= 1) {
            return false;
        } else if (i * i > n){
            return true;
        } else if (n % i == 0) {
            return false;
        }
        return primos(n, i + 1);
    }
}
