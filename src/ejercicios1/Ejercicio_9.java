package ejercicios1;

/*
Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
A continuación, realiza las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D, D tome el valor de B.
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        int A = 4;
        int B = 8;
        int C = 10;
        int D = 79;

        B = C;
        System.out.println("nuevo valor B: " + B);
        C = A;
        System.out.println("nuevo valor C: " + C);
        A = D;
        System.out.println("nuevo valor A: " + A);
        D = B;
        System.out.println("nuevo valor D: " + D);


    }
}
