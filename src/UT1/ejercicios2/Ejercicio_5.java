package UT1.ejercicios2;

/*
Escribe un programa para que muestre tu dirección y tu número de teléfono.
Asegúrate de que los datos se muestran en líneas separadas
 */

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu dirección");
        String calle = scanner.nextLine();
        System.out.println("Número de telefono");
        int telefono = scanner.nextInt();
        System.out.println("Tu dirección es: " + calle);
        System.out.println("Tu número de telefono: " + telefono);
    }
}
