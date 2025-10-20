package UT2.Ejercicios2;

/*
Igual que el anterior, pero el valor de N se leerá por teclado.
*/

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las veces que quieres repetirlas");
        int N = scanner.nextInt();
        int suma = 0;
        int suma2 = 1;
        int suma3;
        for (int i = 1; i <= N; i++) {
            System.out.println(suma);
            suma3 = suma + suma2;
            suma2 = suma;
            suma = suma3;
        }
    }
}
