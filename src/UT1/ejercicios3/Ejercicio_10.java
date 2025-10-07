package UT1.ejercicios3;

/*
Desarrolla un programa que solicite 3 números y compruebe si están ordenados.
*/

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");

        int numero = scanner.nextInt();
        System.out.println("Ingrese un número: ");

        int num = scanner.nextInt();
        System.out.println("Ingrese un número: ");

        int n = scanner.nextInt();
        System.out.println((numero >= num && num >= n) || (numero <= num && num <= n) ? "Estan ordenados" : "No estan ordenados");
    }
}
