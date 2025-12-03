package arrays.Repaso;

import java.util.Arrays;

public class Ej7 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("notas[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

    }
}
