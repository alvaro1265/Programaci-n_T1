package UT2.Ejercicios2;

/*
Crea un programa en el que introduzcas una nota del 1 al 10 y te indique su nota en formato escrito (insuficiente, suficiente, etc.).
*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un la nota (1 al 10): ");
        int nota = scanner.nextInt();
        if (nota >= 1 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }
        scanner.close();
    }
}
