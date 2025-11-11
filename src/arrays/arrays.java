package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        //Ejemplo sin array
        int notaPrimerExamen = 7;
        int notaSegundoExamen = 6;

        //Ejemplo con array
        int[] notas = new int[3];
        notas[0] = 7;
        notas[1] = 9;
        notas[2] = 7;

        System.out.println(Arrays.toString(notas));

        int[] notasAux = notas;
        notas = new int[4];

        //Copiamos los valores
        for (int i = 0; i < notasAux.length; i++) {
            notas[i] = notasAux[i];
        }
        notas[3] = 9;
        System.out.println(Arrays.toString(notas));
        System.out.println(Arrays.toString(notasAux));

        //Ya tenemos en notas los 4 valores
        int[] otra = notas;
        otra[3] = 1;
        System.out.println(Arrays.toString(otra));

        //Inicializacion
        int[] masNotas = {4, 5, 6, 7};
        System.out.println(Arrays.toString(masNotas));
    }
}
