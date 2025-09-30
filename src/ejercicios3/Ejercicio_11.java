package ejercicios3;

/*
Crea un programa que pida cuál es el radio de una circunferencia y nos calcule cuál es la longitud y el área.
*/

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunfirencia: ");
        double radio = scanner.nextDouble();
        System.out.println("La longitud de la circunferencia es: " + (2 * Math.PI * radio));
        System.out.println("El area de la circunferencia es: " + (Math.PI * (radio * radio)));

        scanner.close();
    }
}
