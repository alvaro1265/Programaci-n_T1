package UT2.Ejercicios1;

/*
Realiza un programa que permita la entrada de varios números y calcule su media.
*/

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        double suma = 0;
        int numero;
        do {
            System.out.println("Introduce el numero (Escribe 0 para terminar): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                suma += numero;
                i++;
            }
        } while (numero != 0);
        if (i > 0) {
            double media = suma / i;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se puede realizar la operacion");
        }
        scanner.close();
    }
}