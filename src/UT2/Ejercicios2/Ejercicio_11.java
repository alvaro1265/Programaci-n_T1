package UT2.Ejercicios2;

/*
Programa un juego que genere un número aleatorio y te permita introducir números hasta que des con el adecuado.
El juego deberá indicarte si el número introducido es mayor o menor.
*/

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero y acierte: ");
        int min = 0;
        int max = 500;
        int numero = (int) (Math.random() * (max - min + 1) + min);
        for (int i = min; i <= max; i++) {
            int numero1 = scanner.nextInt();
            if (numero1 == numero) {
                System.out.println("¡Acertaste!!!!!!!!");
                break;
            } else if (numero1 < numero) {
                System.out.println("Ingrese un numero más grande: ");
            } else {
                System.out.println("Ingrese un numero más pequeño: ");
            }
        }
        scanner.close();
    }
}
