package arrays;

import java.util.Arrays;
import java.util.Random;

public class ejercicio_1 {
    public static void main(String[] args) {

        int[] numeroRamdom = new int[20];

        for (int i = 0 ; i < numeroRamdom.length; i++){
            Random r = new Random();
            numeroRamdom[i] = r.nextInt(10);
        }

        System.out.println(Arrays.toString(numeroRamdom));

    }
}
