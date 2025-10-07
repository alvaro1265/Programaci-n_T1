package UT1.ejercicios3;

/*
Crea un programa que compruebe si un año es bisiesto.
“Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, terminado en «00»-,
en cuyo caso también ha de ser divisible entre 400.”
 */

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un año: ");

        int year = scanner.nextInt();
        boolean bisisesto = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println(bisisesto ? "Es bisesto" : "No es bisesto");
    }
}
