package ejercicios2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");

        int numero = scanner.nextInt();

        System.out.println("El doble del número introducido es: " + numero * 2);
        System.out.println("El triple del número introducido es:" + numero * 3);
    }
}
