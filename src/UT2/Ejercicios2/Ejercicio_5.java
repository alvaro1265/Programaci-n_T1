package UT2.Ejercicios2;

/*
Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
………….
1 2 3 4 5 …..n
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una numero: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
