package UT2.Ejercicios5;

/*
Crea un array de 20 elementos donde hay almacenados números enteros aleatorios (hasta 10).
Haz un programa que pida un número y diga cuántas veces aparece el número dentro del array.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        Random r = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(11);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero que desea saber la repeticion: (Del 1 al 10)");
        int bucarNum = scanner.nextInt();

        int n = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == bucarNum) {
                n++;
            }
        }

        System.out.println("El número " + bucarNum + " aparece " + n + " veces");

        scanner.close();
    }
}
