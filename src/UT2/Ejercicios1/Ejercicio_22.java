package UT2.Ejercicios1;

/*
Desarrolla un programa que lea números hasta que se introduzca un número negativo y después indique si se ha dado el mismo número dos veces consecutivas:
Introduciendo: 1 3 5 3 4 6 7 –1
Da como salida: No
Introduciendo: 1 3 5 6 6 4 3 –1
Da como salida : Si
*/

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int antes = -1;
        boolean repetido = false;

        do {
            System.out.println("Introduce el numero: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                if (numero == antes) {
                    repetido = true;
                }
                antes = numero;
            }
        }while (numero >= 0);
        if (repetido) {
            System.out.println("Sí");
        }else {
            System.out.println("No");
        }

        scanner.close();
    }
}
