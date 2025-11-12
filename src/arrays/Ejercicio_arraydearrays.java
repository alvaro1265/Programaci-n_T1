package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_arraydearrays {
    public static void main(String[] args) {
        //con array simplificado
        /*
        int[] cadena1 = {1, 2, 3};
        int[] cadena2 = {4, 5, 6};

        int[][] conjuncion = {cadena1, cadena2};

        for (int[] conjunto : conjuncion) {
            System.out.println(Arrays.toString(conjunto));
        }
        */

        Scanner scanner = new Scanner(System.in);

        int[][] union = new int[2][3];
        int k = 1;

        for (int i = 0; i < union.length; i++) {
            for (int j = 0; j < union[i].length; j++) {
                union[i][j] = k++;
            }
        }

        for (int[] uno : union) {
            System.out.println(Arrays.toString(uno));
        }
    }
}
