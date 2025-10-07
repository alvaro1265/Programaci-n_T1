package UT1.ejercicios3;

/*
Realiza un programa que calcule cuántos billetes hay que darle a un cliente que quiera sacar cierta cantidad de dinero de su banco.
Siempre calcularemos la mínima cantidad de billetes.

    Ejemplo:
	Teclea la cantidad de euros: 3475
	La cantidad de billetes que te tengo que dar es:
	6 billetes de 500€
	2 billetes de 200€
	0 billetes de 100€
	1 billetes de 50€
	1 billetes de 20€
	0 billetes de 10€
	1 billetes de 5€
*/

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea la cantidad de euros: ");

        int euros = scanner.nextInt();
        int billetes500 = euros / 500;
        euros = euros % 500;
        int billetes200 = euros / 200;
        euros = euros % 200;
        int billetes100 = euros / 100;
        euros = euros % 100;
        int billetes50 = euros / 50;
        euros = euros % 50;
        int billetes20 = euros / 20;
        euros = euros % 20;
        int billetes10 = euros / 10;
        euros = euros % 10;
        int billetes5 = euros / 5;
        euros = euros % 5;

        System.out.println(billetes500 + " billetes de 500€");
        System.out.println(billetes200 + " billetes de 200€");
        System.out.println(billetes100 + " billetes de 100€");
        System.out.println(billetes50 + " billetes de 50€");
        System.out.println(billetes20 + " billetes de 20€");
        System.out.println(billetes10 + " billetes de 10€");
        System.out.println(billetes5 + " billetes de 5€");

        scanner.close();
    }
}
