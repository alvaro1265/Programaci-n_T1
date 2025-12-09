package UT2.Ejercicios6;

/*
Desarrolla un programa que reciba una cadena y diga cuántas palabras contiene. (Las palabras pueden estar separadas por espacios, puntos o comas).

Introduciendo: “Hola a todos. Adios”

Da como salida: 4
*/

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();
        scanner.close();

        System.out.println(frase.indexOf(frase));
    }
}
