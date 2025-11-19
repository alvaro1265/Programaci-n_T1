package UT2.Ejercicios5;

/*
Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura:
*/

import java.util.Arrays;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int[] fila = new int[5];
        int[] columna = new int[5];

        int[] tabla = new int[fila.length + columna.length];

        int k = 1;
        for (int i = 0; i <= tabla.length; i++) {
            for (int j = i; j < tabla.length; j++) {
                //tabla[i][j] = k++;
            }

            //for (int[] fila : tabla){
                System.out.println(Arrays.toString(fila));
            }
        }
    }
}
