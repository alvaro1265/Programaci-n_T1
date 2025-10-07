package Introducción;

import java.util.Scanner;

public class PruebaDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número y te saco el doble");
            numero = scanner.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        } while (numero != 0);
    }
}
