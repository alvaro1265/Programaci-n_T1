package UT2.Ejercicios4;

/*
Metodo factorial(), que calculará el factorial del número que se le pasa como parámetro.
Retornará el resultado del cálculo del factorial,
o bien un -1 en caso de que el parámetro pasado sea negativo,
y un -2 en caso de que el parámetro pasado sea cero.
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        scanner.close();

        int resultado = factorial(numero);
        System.out.println("El factorial es: " + resultado);

    }
    static int factorial(int a) {
        if (a < 0) {
            return -1;
        } else if (a == 0) {
            return -2;
        } else if (a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}