package UT2.Ejercicios5;

/*
Comprobar si un array de 5x5 es un cuadro mágico.
Se considera un cuadro mágico aquel en el que las filas, las columnas y las diagonales suman igual.
*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int[][] numero = new int[5][5];
        Random r = new Random();
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = r.nextInt(10);
            }
        }

        for (int[] num : numero) {
            System.out.println(Arrays.toString(num));
        }

        int[] sumaF = new int[numero[0].length];
        int[] sumaC = new int[numero[0].length];
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sumaF[i] += numero[i][j];
                sumaC[j] += numero[i][j];
                if (i == j) diagonal1 += numero[i][j];
                if (i + j == numero.length - 1) diagonal2 += numero[i][j];
            }
        }

        for (int i = 0; i < numero.length; i++) {
            if ((sumaF[i] == sumaC[i]) == (diagonal1 == diagonal2)) {
                System.out.println("Es un cuadrado magico");
            } else {
                System.out.println("No es un cuadrado magico");
            }
        }
    }
}
