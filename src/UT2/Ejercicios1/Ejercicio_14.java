package UT2.Ejercicios1;

/*
Lee un número por teclado y comprueba que este número es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
*/

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        System.out.println("El número introducido es: " + numero);
        scanner.close();
    }
}
