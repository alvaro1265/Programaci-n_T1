package UT2.Ejercicios5;

/*
Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura:
*/

import java.util.Arrays;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int suma = i + j;
                if (suma <= 5 - 1) {
                    tabla[i][j] = suma;
                } else {
                    tabla[i][j] = 2 * (5 - 1) - suma;
                }
            }
        }

        for (int[] conjunto : tabla) {
            System.out.println(Arrays.toString(conjunto));
        }
    }
}
