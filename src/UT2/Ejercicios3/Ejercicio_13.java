package UT2.Ejercicios3;

/*
Sobrecarga un metodo saludar que pueda recibir: sin parámetros, un nombre, un nombre y unos apellidos.
*/

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre");
        String nombre = scanner.next();
        System.out.println("Ingresa su primer apellido");
        String apellidos = scanner.next();
        System.out.println("Ingresa su segundo apellido");
        String apellidos2 = scanner.next();

        scanner.close();

        saludar();
        saludar(nombre);
        saludar(nombre, apellidos, apellidos2);
    }

    static void saludar() {
        System.out.println("Hola Usuario");
    }

    static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    static void saludar(String nombre, String apellido, String apellidos2) {
        System.out.println("Hola " + nombre + " " + apellido + " " + apellidos2);
    }
}
