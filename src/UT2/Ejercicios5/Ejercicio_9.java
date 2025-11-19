package UT2.Ejercicios5;

/*
Crea un programa que mezcle dos arrays ordenados de N elementos,
consiguiendo otro array de N*2 elementos igualmente ordenados.
*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] lista1 = new int[5];
        int[] lista2 = new int[5];

        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = r.nextInt(20);
        }
        for (int j = 0; j < lista2.length; j++){
            lista2[j] = r.nextInt(20);
        }

        Arrays.sort(lista1);
        Arrays.sort(lista2);

        System.out.println("Array 1: " + Arrays.toString(lista1));
        System.out.println("Array 2: " + Arrays.toString(lista2));

        int[] conjunto = new int[lista1.length + lista2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lista1.length && j < lista2.length) {
            if (lista1[i] < lista2[j]){
                conjunto[k] = lista1[i];
                i++;
            } else {
                conjunto[k] = lista2[j];
                j++;
            }
            k++;
        }
        while (i < lista1.length){
            conjunto[k] = lista1[i];
            i++;
            k++;
        }
        while (j < lista2.length) {

            conjunto[k] = lista2[j];
            j++;
            k++;
        }

        System.out.println("Array resultado: " + Arrays.toString(conjunto));
    }
}