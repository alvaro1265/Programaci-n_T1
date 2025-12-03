package arrays.Repaso;

import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {
//        int[] notas = {4, 9, 7, 5, 10};
//        System.out.println(Arrays.toString(notas));
//        notas[0] = 6;
//        System.out.println(Arrays.toString(notas));
//        notas = new int[4];
//        System.out.println(Arrays.toString(notas));

        int[] numeros = {7, 4, 9};
        System.out.println(Arrays.toString(numeros));
        numeros[1] = 6;
        System.out.println(Arrays.toString(numeros));

        int[] temp = numeros;
        numeros = new int[5];
        System.out.println("Nuevo: " + Arrays.toString(numeros));
        System.out.println("Original: " + Arrays.toString(temp));
    }
}
