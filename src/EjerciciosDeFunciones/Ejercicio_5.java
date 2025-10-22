package EjerciciosDeFunciones;

/*
Crea una funcion que te devuelva el mayor de 3 números
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int a = scanner.nextInt();
        System.out.println("Introduce un numero");
        int b = scanner.nextInt();
        System.out.println("Introduce un numero");
        int c = scanner.nextInt();
        scanner.close();
        int Numero = NumeroMasGrande(a, b, c);
        System.out.println("El numero mas grande es: " + Numero);
    }
    static int NumeroMasGrande (int a, int b, int c){
        if (a <= b && b >= c){
            return b;
        } else if (a >= b && a >= c) {
            return a;
        } else {
            return c;
        }
    }
}
