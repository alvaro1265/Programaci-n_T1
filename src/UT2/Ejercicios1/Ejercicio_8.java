package UT2.Ejercicios1;

 /*
 Escribir un programa en Java que imprima por pantalla los números pares entre el 5 y el 15.000
 */

public class Ejercicio_8 {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15000) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
