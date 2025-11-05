package UT2.Ejercicios4;

/*
Escribe el metodo inverso(), que recibe un numero y retorna el inverso
(si recibe el 1234 da como retorno el 4321). Prohibido usar metodo reverse()
*/

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();

        scanner.nextLine();

        int resultado = inverso(a);
        System.out.println(resultado);
    }

    static int inverso(int n) {
        int digitos = contarDigitos(n);
        return inverso(n, digitos);
    }

    static int inverso(int n, int digitos) {
        if (n < 10) {
            return n;
        } else {
            int ultimo = n % 10;
            return (int) ((ultimo * Math.pow(10, digitos - 1)) + inverso(n / 10, digitos - 1));
        }
    }

    static int contarDigitos(int n) {
        if (n < 10) return 1;
        return 1 + contarDigitos(n / 10);
    }
}