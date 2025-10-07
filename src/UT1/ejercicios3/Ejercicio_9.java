package UT1.ejercicios3;

/*
Desarrolla un programa que indique el peso que tienes en la luna.
Gravedad en la tierra 9,8 y en la luna 1,62.
 */

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte su peso: ");

        double peso = scanner.nextDouble();
        peso = peso * (1.62 / 9.81);
        System.out.println("Su peso en la luna es de: " + peso + " Kg");
    }
}
