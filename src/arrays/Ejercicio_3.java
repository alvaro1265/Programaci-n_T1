package arrays;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos datos vas a meter");
        int cantidadDatos = scanner.nextInt();

        String[] nombres = new String[cantidadDatos];

        int[] telefonos = new int[cantidadDatos];

        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("escribe el nombre");
            String nombre = scanner.next();
            nombres[i] = nombre;

            System.out.println("ahora escribe el numero");
            telefonos[i] = scanner.nextInt();

            System.out.println("Nombre: " + nombres[i] + " Telefono: " + telefonos[i]);
        }

        scanner.close();

    }
}
