package UT2.Ejercicios2;

/*
Realizar un programa que calcule la potencia de un número baseexponente.
La potencia se hará por medio de multiplicaciones, está prohibido usar Math.pow()
*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();
        System.out.println("Ingrese el exponenete");
        int exponenete = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= exponenete; i++) {
            resultado = resultado * numero;
        }
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
