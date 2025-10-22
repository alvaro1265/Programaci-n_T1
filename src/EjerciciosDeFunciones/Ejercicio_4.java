package EjerciciosDeFunciones;

/*
Escribe un metodo para calcular el área de un rectángulo dados base y altura.
*/

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce base del rectangulo: ");
        int base = scanner.nextInt();
        System.out.println("Introduce altura del rectangulo: ");
        int altura = scanner.nextInt();
        scanner.close();
        int area = area(base, altura);
        System.out.println("El area es: " + area);
    }
    static int area (int base, int altura){
        return (base * altura);

    }
}
