package UT2.Ejercicios1;

/*
Haz el mismo ejercicio anterior con otro bucle
*/

public class Ejercicio_12 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);

    }
}
