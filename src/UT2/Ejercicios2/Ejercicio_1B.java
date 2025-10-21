package UT2.Ejercicios2;

/*
Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos. Ejemplo con 4:
*
**
***
****
***
**
*
*/

import java.util.Scanner;

public class Ejercicio_1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura del triangulo rectangulo: ");
        int altura = scanner.nextInt();
        int i = 1;
        while (i <= altura) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }
        i = altura - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        scanner.close();
    }
}
