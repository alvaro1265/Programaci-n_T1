package UT2.Ejercicios5;

/*
Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura:
*/

import java.util.Arrays;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < i; j++){
               // System.out.print(Arrays.toString(i));
            }
            System.out.println();
        }
    }
}
