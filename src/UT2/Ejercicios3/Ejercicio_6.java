package UT2.Ejercicios3;

/*
Implementa un metodo que calcule el mayor entre tres números.
*/

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int numero3 = scanner.nextInt();
        scanner.close();
        int mayor = MayorNumero(numero1, numero2, numero3);
        System.out.println("El numero mas grande es: " + mayor);
    }
    static int MayorNumero(int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
