package UT2.Ejercicios2;

/*
Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.
*/

public class Ejercicio_9 {
    public static void main(String[] args) {
        int N = 20;
        int suma = 0;
        int suma2 = 1;
        int suma3;
        for (int i = 1; i <= N; i++) {
            System.out.println(suma);
            suma3 = suma + suma2;
            suma = suma2;
            suma2 = suma3;
        }
    }
}
