package UT2.Ejercicios4;

/*
Escribe un metodo recursivo para calcular la serie de Fibonacci hasta n.
*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de repeticiones: ");
        int n = scanner.nextInt();

        scanner.close();

        System.out.println("Serie de Fibonacci hasta " + n + " términos:");
        Fibonacci(0, 1, n);

    }

    static void Fibonacci(int a, int suma, int suma2) {
        if (suma2 > 0) {
            System.out.println(a + " ");
            Fibonacci(suma, a + suma, suma2 - 1);
        }
    }
}
