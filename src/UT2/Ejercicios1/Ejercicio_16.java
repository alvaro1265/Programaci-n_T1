package UT2.Ejercicios1;

/*
Desarrolla un programa que dado el día y mes de nacimiento te indique cuáles tu signo del zodiaco.
*/

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.println("Introduce mes de nacimiento: ");
        int mes = scanner.nextInt();
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Fecha no valida.");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Geminis");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cancer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario");
        } else {
            System.out.println("Piscis");
        }
        scanner.close();
    }

}
