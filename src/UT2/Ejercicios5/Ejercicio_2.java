package UT2.Ejercicios5;

/*
Dado un array de números enteros, realiza un programa que indique si está ordenado o no.
*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(20);
        }

        System.out.println(Arrays.toString(numeros));

        boolean ordenado = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
            }
        }

        if (!ordenado) {
            System.out.println("Esta desordenado");
        } else {
            System.out.println("No esta desordenado");
        }
    }
}
