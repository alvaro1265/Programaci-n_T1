package UT2.pruebas;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce una palabra");
        String palabra = scanner.nextLine();
        scanner.close();

        System.out.println(palabra + " tiene: " + palabra.length() + " Caracteres");
        System.out.println("El primer caracter de: " + palabra + " es: " + palabra.charAt(0));
        System.out.println(palabra.charAt(palabra.length() - 1));
        System.out.println(palabra.contains("a"));
    }


}
