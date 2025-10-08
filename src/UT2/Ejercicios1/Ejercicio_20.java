package UT2.Ejercicios1;

/*
Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes,
mostrando el resultado en pantalla.
*/

import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();

        int suma = 0;
        for (int i = numero; i <= numero + 100; i++) {
            suma += i;
            System.out.println("sumamos: " + i);
        }

        System.out.println("El total es: " + suma);
        scanner.close();
    }
}
