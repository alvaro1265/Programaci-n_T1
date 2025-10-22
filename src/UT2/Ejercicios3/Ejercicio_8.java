package UT2.Ejercicios3;

/*
Define un metodo que retorne el valor absoluto de un número entero.
*/

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();
        int absoluto = NumeroAbsoluto(numero);
        System.out.println("El valor absoluto de: " + numero + " = " + absoluto);
    }

    static int NumeroAbsoluto(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
