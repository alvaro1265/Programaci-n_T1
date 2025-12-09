package UT2.Ejercicios6;

/*
Crea un programa que pase un String a mayúsculas y diga cuántas letras han cambiado.

Introduciendo: “Hola a Todos”

Da como salida: “HOLA A TODOS” 8 cambios
*/

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String palabra = scanner.nextLine();
        scanner.close();

        String palabraEnMayuscula = palabra.toUpperCase();

        System.out.println("palabra original :: " + palabra);
        System.out.println("palabra en mayuscula :: " + palabraEnMayuscula);


        int contador = 0;
        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) != palabraEnMayuscula.charAt(i)) {
                contador++;
            }
        }
        System.out.println("Han habido " + contador + " cambios");

    }
}
