package UT2.Ejercicios3;

/*
Implementa dos métodos llamados multiplicar:
•Uno que reciba dos enteros y devuelva la multiplicación.
•Otro que reciba tres enteros y devuelva la multiplicación.
•Llama a ambos desde el main y muestra los resultados.
*/

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = scanner.nextInt();
        System.out.println("Ingresa un numero");
        int numero2 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        int numero3 = scanner.nextInt();

        scanner.close();

        int resultado = multiplicar(numero, numero2);
        System.out.println("La multiplicacion de " + numero + " * " + numero2 + " = " + resultado);
        int resultado2 = multiplicar(numero, numero2, numero3);
        System.out.println("La multiplicacion de " + numero + " * " + numero2 + " * " + numero3 + " = " + resultado2);
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

    static int multiplicar(int a, int b, int c) {
        return a * b * c;
    }
}
