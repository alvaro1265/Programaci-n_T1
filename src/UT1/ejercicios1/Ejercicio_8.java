package UT1.ejercicios1;

/*
Programa Java que declare una variable entera N y asígnale un valor.
A continuación, escribe las instrucciones que realicen lo siguiente: Incrementar N en 77,
Decrementarla en 3, Duplicar su valor.
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Valor inicial de N: " + n);
        n = n + 77;
        System.out.println("n + 77: " + n);
        n = n - 3;
        System.out.println("n - 3: " + n);
        n = n * 2;
        System.out.println("n * 2: " + n);

    }
}
