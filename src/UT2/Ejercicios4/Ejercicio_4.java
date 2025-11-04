package UT2.Ejercicios4;

/*
Realiza un metodo redondear() al que se le pasa como parámetro un numero float
y los decimales que deben quedar después de redondear, y retorna el numero redondeado.
Ejemplo: redondear( 234.49234 , 3 )
Da como resultado : 234.492
*/

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero con decimales: ");
        float numero = scanner.nextFloat();

        System.out.println("ingresa el numero de dcimales que se requieran:");
        int decimales = scanner.nextInt();

        scanner.close();

        float resultado = redondear(numero, decimales);
        System.out.println("Numero redondeado: " + resultado);

    }

    static float redondear(float a, int n) {
        if (n == 0) {
            return Math.round(a);
        } else {
            a *= 10;
            float resultado = redondear(a, n - 1);
            return resultado / 10;
        }
    }
}