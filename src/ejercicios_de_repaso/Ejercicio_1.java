package ejercicios_de_repaso;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la altura del arbol: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        int tronco = altura / 5;

        for (int j = 0; j < tronco; j++) {
            for (int v = 1; v < altura; v++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
