package UT2.Ejercicios3;

/*
Crea un metodo llamado operacion que reciba dos números y un código
de operación (1 para suma, 2 para resta, 3 para multiplicación, 4 para división).
Según el código, el metodo debe realizar la operación indicada y mostrar el resultado.
*/

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el codigo de la operacion (1 para suma, 2 para resta, 3 para multiplicación, 4 para división): ");
        int codigo = scanner.nextInt();
        scanner.close();
        operacion(codigo, numero, numero2);
    }
    static void operacion(int a, int b, int c) {
        if (a == 1) {
            System.out.println("La suma de: " + b + " + " + c + " = " + (b + c));
        } else if (a == 2) {
            System.out.println("La resta de: " + b + " - " + c + " = " + (b - c));
        } else if (a == 3) {
            System.out.println("La multiplicacion de: " + b + " * " + c + " = " + (b * c));
        } else if (a == 4) {
            System.out.println("La division de: " + b + " / " + c + " = " + (b / c));
        }
    }
}
