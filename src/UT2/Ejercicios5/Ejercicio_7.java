package UT2.Ejercicios5;

/*
Dado un array de 3x3 elementos, calcular la suma de sus filas
y sus columnas almacenándolas en dos array de 3 elementos.
*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int[][] numero = new int[3][3];
        Random r = new Random();

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = r.nextInt(10);
            }
        }

        int[] sumaF = new int[numero[0].length];
        int[] sumaC = new int[numero[0].length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaF[i] += numero[i][j];
                sumaC[j] += numero[i][j];
            }
        }

        for (int[] num : numero) {
            System.out.println(Arrays.toString(num));
        }

        System.out.println("Suma de filas: " + Arrays.toString(sumaF));
        System.out.println("Suma de columnas: " + Arrays.toString(sumaC));
    }
}
