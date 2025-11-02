package UT2.Ejercicios4;

/*
Haz un metodo llamado esVocal(), al que se le pasa como parámetro un carácter
y retorna un valor true en caso de que el carácter sea una vocal, y un valor false en caso contrario
*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);

        scanner.close();

        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        boolean resultado = esVocal(letra, vocales, 0);
        if (resultado) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No Es vocal");
        }

    }

    static boolean esVocal(char a, char[] vocales, int i) {
        if (a == vocales[i]) {
            return true;
        } else if (a != vocales[i]) {
            return false;
        }
        return esVocal(a, vocales, i + 1);
    }
}
