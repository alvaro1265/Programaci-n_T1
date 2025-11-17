package UT2.Ejercicios5;

/*
Dado un array de 50 números entre 1 y 100, aleatorios,
escribir una lista ordenada con los valores que no aparecen en el array.
*/


import java.util.Arrays;
import java.util.Random;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int[] numero = new int[50];

        Random r = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(100) + 1;
        }

        boolean[] ordenado = new boolean[101];
        for (int numeros : numero) {
            ordenado[numeros] = true;
        }
        for (int i = 1; i <= 100; i++) {
            if (!ordenado[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
