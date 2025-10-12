package UT2.Ejercicios1;

/*
Mostrar la tabla de multiplicar de un número.
*/

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("Tabla de multiplicar: " + numero);
        int i = 1;
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
        scanner.close();
    }
}
