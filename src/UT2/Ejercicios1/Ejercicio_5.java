package UT2.Ejercicios1;

/*
Crea un programa que pide tu edad y compruebe si puedes votar.
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        if (edad < 0 || edad > 120) {
            System.out.println("Edad no valida");
        } else if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar");
        }
        scanner.close();
    }
}
