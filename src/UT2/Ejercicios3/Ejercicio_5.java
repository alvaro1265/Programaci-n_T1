package UT2.Ejercicios3;

/*
Crea un metodo para determinar si un número es par o impar.
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = scanner.nextInt();
        scanner.close();
        ParImpar(numero);
    }
    static int ParImpar (int a){
        if (a % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        return a;
    }
}
