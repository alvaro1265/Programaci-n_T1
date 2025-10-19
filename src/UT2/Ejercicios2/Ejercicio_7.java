package UT2.Ejercicios2;


//Pide por teclado dos números y genera 10 números aleatorios entre esos números.
//Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int)


import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        System.out.println("Introduce un numero");
        int numero2 = scanner.nextInt();
        int max = Math.max(numero, numero2);
        int min = Math.min(numero, numero2);
        for (int j = 1; j <= 10; j++) {
            int i = (int) ((Math.random() * (max - min + 1)) + min);
            System.out.println(i);
        }
        scanner.close();
    }
}
