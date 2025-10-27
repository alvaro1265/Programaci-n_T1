package UT2.Ejercicios3;

/*
Sobrecarga sumar: crea versiones que sumen dos, tres y cuatro enteros.
*/

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce un numero: ");
        int num3 = scanner.nextInt();
        System.out.println("Introduce un numero: ");
        int num4 = scanner.nextInt();
        scanner.close();
        System.out.println("\n Resultados de las sumas:");
        System.out.println("Suma de 2 números: " + sumar(num1, num2));
        System.out.println("Suma de 3 números: " + sumar(num1, num2, num3));
        System.out.println("Suma de 4 números: " + sumar(num1, num2, num3, num4));
    }
    static int sumar (int a, int b) {
        return a + b;
    }
    static int sumar (int a, int b, int c) {
        return a + b + c;
    }
    static int sumar (int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
