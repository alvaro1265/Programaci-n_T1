package UT2.Ejercicios3;

/*
Escribe un metodo para calcular el área de un rectángulo dados base y altura.
*/

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la base del rectangulo: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese el tamaño de la altura del rectangulo");
        int altura = scanner.nextInt();
        scanner.close();
        int area = CalculaArea(base, altura);
        System.out.println("El area del rectangulo es: " + area);
    }
    static int CalculaArea(int base, int altura){
        return (base * altura);
    }
}
