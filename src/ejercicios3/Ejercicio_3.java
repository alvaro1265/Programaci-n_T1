package ejercicios3;

/*
Crea un programa que compruebe si eres mayor de edad.
 */

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");

        int numero = scanner.nextInt();
        System.out.println((numero >= 18) ? "Eres mayor de edad" : "Eres menor de edad");

    }
}
