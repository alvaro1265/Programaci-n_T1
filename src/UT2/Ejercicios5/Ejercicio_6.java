package UT2.Ejercicios5;

/*
Crea un programa que rellene un array de 4x4 de la siguiente manera:
*/

import java.util.Arrays;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int[][] numero = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j) {
                    numero[i][j] = 1;
                } else {
                    numero[i][j] = 0;
                }
            }
        }

        for (int[] num : numero) {
            System.out.println(Arrays.toString(num));
        }
    }
}
