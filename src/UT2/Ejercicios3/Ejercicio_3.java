package UT2.Ejercicios3;

/*
Implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado.
*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa una edad: ");
        int edad = scanner.nextInt();
        scanner.close();
        Mensaje(nombre, edad);
    }
    static void Mensaje(String a, int b){
        System.out.println("Tu nombre es: " + a + " Y tu edad es: " + b);
    }
}
