package arrays;

import java.util.Scanner;

public class Ejerccicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos datos vas a meter");
        int cantidadDatos = sc.nextInt();

        String[] nombres = new String[cantidadDatos];

        int[] telefonos = new int[cantidadDatos];

        for (int i = 0; i < cantidadDatos; i++) {
            System.out.println("escribe el nombre");
            String nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("ahora escribe el numero");
            telefonos[i] = sc.nextInt();

            System.out.println("Nombre: " + nombres[i] + " Telefono: " + telefonos[i]);
        }

        sc.close();

    }
}
