package ejercicios2;

/*
Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu velocidad en Km/h");
        int velocidad = scanner.nextInt();
        System.out.println("Tu velocidad en m/s es de: " + velocidad / 3.6);
    }
}
