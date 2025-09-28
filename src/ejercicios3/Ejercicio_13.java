package ejercicios3;

/*
Realiza un programa que nos pida cuantos segundos duró un concierto, y nos calcule cuántas horas, minutos y segundos son.

	Ejemplo:
	Cuantos segundos duró el concierto: 8479
	Equivale a 2:21:19
*/

import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración del concierto en segundos: ");

        int duracion = scanner.nextInt();
        int horas = duracion / 3600;
        int minutos = duracion % 3600 / 60;
        int segundos = duracion % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
