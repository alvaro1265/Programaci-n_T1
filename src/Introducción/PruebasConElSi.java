package Introducción;

import java.util.Scanner;

public class PruebasConElSi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        //IF anidado
        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Estas jubilado");
            } else {
                System.out.println("Eres un trabajador");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

        //IF encadenados
        if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else if (edad >= 18) {
            System.out.println("Eres un trabajador");
        } else {
            System.out.println("Eres menor de edad");
        }

        //mal !!!!
        if (edad >= 18) {
            System.out.println("Eres un trabajador");
        } else if (edad >= 65) {
            System.out.println("Estas jubilado");
        } else {
            System.out.println("Eres menor de edad");
        }

        scanner.close();
    }
}
