package UT2.Ejercicios1;

/*
Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
Da como salida: 33
*/

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double suma = 0;
        int numero;

        while (i < 5) {
            System.out.println("Introduce un número (se detiene al escribir 5 ceros): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                i++;
            } else {
                suma += numero;
            }
        }

        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}
