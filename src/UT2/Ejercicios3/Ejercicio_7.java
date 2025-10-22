package UT2.Ejercicios3;

/*
Escribe un metodo que convierta grados Celsius a Fahrenheit.
*/

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius: ");
        float temperatura = scanner.nextFloat();
        scanner.close();
        float fahrenheit = Temperatura(temperatura);
        System.out.println("El temperatura es: " + fahrenheit);
    }
    static float Temperatura(float temperatura){
        return (temperatura * 9 / 5) + 32;
    }
}
