package UT2.Ejercicios5;

/*
Crea una agenda para almacenar nombres y direcciones de N personas.
Después haz un programa que permita ir consultando el nombre y la dirección de las personas almacenadas.
*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de entradas que se quieren hacer: ");
        int entradas = scanner.nextInt();

        String[] nombre = new String[entradas];
        String[] direccion = new String[entradas];

        for (int i = 0; i < entradas; i++) {
            System.out.println("Ingrese el nombre que se desea almacenar en la agenda: ");
            nombre[i] = scanner.next();

            System.out.println("ingrese la direccion:");
            direccion[i] = scanner.next();
        }

        System.out.println("Quieres consultar en la agenda: (true/false)");
        boolean consuta = scanner.nextBoolean();

        if (consuta) {

            for (int i = -1; i != 0; i++) {
                System.out.println("Ingrese el numero de la entrada que se desea consultar: " + " Ingrese un numero de 1 a " + entradas);
                i = scanner.nextInt();

                if (i > 0 && i <= entradas) {
                    System.out.println("Nombre: " + nombre[i - 1]);
                    System.out.println("Direccion: " + direccion[i - 1]);
                } else if (i != 0) {
                    System.out.println("Fuera de rango");
                }
            }
        } else {
            System.out.println("La agenda esta cerrada");
        }

        scanner.close();
    }
}
