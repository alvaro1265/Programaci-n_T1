package UT2.Ejercicios5;

/*
Desarrolla un programa que ordene los índices de un array de enteros, en función del contenido de cada elemento del array,
de mayor a menor, es decir, hay que almacenar en otro array el índice del array original, en función del contenido del último
*/

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int[] numero = new int[5];

        Random r = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = r.nextInt(50);
        }

        System.out.println("Array original: " + Arrays.toString(numero));

        for (int i = 0; i < numero.length; i++) {
            Arrays.sort(numero);
            System.out.println(Arrays.toString(numero));
        }
    }
}
