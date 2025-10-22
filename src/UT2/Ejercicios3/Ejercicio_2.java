package UT2.Ejercicios3;

/*
Define un metodo sumar que reciba dos enteros y retorne su suma.
*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        int num2 = scanner.nextInt();
        scanner.close();
        int resultado = sumar(num1,num2);
        System.out.println("La suma de: " + num1 + " + " + num2 + " = " + resultado);
    }
    static int sumar(int a, int b){
        return a + b;
    }
}
