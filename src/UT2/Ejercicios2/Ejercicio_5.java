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
        int i = 1;
        while (i <= numero){
            int j = 1;
            while (j <= i){
                System.out.print(j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
        scanner.close();
    }
}
