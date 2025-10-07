package Introducción;

import java.util.Scanner;

public class PruebaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = -1;
        while (numero != 0) {
            System.out.println("Introduce un número y te saco el doble");
            numero = scanner.nextInt();
            System.out.println("El doble de " + numero + " es " + numero * 2);
        }
    }
}
