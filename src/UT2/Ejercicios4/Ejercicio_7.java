package UT2.Ejercicios4;

/*
Metodo repite(), que recibe como parámetro una cadena de caracteres y un número,
y retorna un nuevo String donde aparece repetida la cadena de caracteres tantas veces como indique el numero pasado como parámetro.
*/

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Introduce el numero de veces que se quiere repetir: ");
        int a = scanner.nextInt();

        scanner.nextLine();

        System.out.println(repite(frase, a));

    }

    static String repite(String frase, int a) {
        if (a <= 0) {
            return "";
        } else if (a == 1) {
            return frase;
        } else {
            return frase + "\n" + repite(frase, a - 1);
        }
    }
}
