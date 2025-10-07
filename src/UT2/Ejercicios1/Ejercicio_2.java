package UT2.Ejercicios1;

/*
Calcular el mayor de tres números enteros en Java.
*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = scanner.nextInt();
        int NumeroMayor;

        if (numero >= numero2 && numero >= numero3) {
            NumeroMayor = numero;
        } else if (numero2 >= numero && numero2 >= numero3) {
            NumeroMayor = numero2;
        } else {
            NumeroMayor = numero3;
        }
        System.out.println("El número más grande es: " + NumeroMayor);
        scanner.close();
    }
}
