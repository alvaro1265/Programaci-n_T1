package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int[] numeroRamdom = new int[20];

        for (int i = 0; i < numeroRamdom.length; i++) {
            Random r = new Random();
            numeroRamdom[i] = r.nextInt(10);
        }

        System.out.println(Arrays.toString(numeroRamdom));

        boolean ordenado = true;
        for (int i = 0; i < numeroRamdom.length - 1; i++) {
            int elementoActual = numeroRamdom[i];
            int elementoSiguiente = numeroRamdom[i + 1];

            if (elementoSiguiente < elementoActual) {
                ordenado = false;
            }
        }

        System.out.println(ordenado ? "Esta ordenado" : "No esta ordenado");
    }
}
