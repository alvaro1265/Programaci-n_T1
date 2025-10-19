package UT2.Ejercicios2;

/*
Desarrolla un programa que pida un número por teclado y te muestre el número de cifras que tiene.
*/

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();
        int cifra;
        if (numero == 0) {
            cifra = 1;
        } else {
            cifra = 0;
            int num = Math.abs(numero);
            while (num > 0) {
                num = num / 10;
                cifra++;
            }
        }
        System.out.println("El numero es: " + cifra);
        scanner.close();
    }
}
