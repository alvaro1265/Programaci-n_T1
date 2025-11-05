package UT2.Ejercicios4;

/*
Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de caracteres.
Estos métodos reciben un String y retornan ese String ya cifrado o descifrado.
Para hacer el cifrado de un String,
se cambia cada letra por la que está dos puestos mas adelante( la a se cambia por la c),
teniendo en cuenta que el cambio es circular, es decir, la z se cambiará por la b.
El proceso de descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán ningún cambio.
*/

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseas cifrar o descifrar: (true = cifrar / false = descifrar)");
        boolean CifDef = scanner.nextBoolean();
        scanner.nextLine();

        if (CifDef) {
            System.out.println("Introduce la frase a cifrar: ");
        } else {
            System.out.println("Introduce la frase a descifrar: ");
        }
        String frase = scanner.nextLine();

        scanner.close();

        if (CifDef) {
            System.out.println("La frase cifrada es: " + cifrar(frase));
        } else {
            System.out.println("La frase descifrada es: " + descifrar(frase));
        }

    }

    static String cifrar(String frase) {
        StringBuilder fraseFinal = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            if (a >= 'a' && a <= 'z') {
                a = (char) ('a' + (a - 'a' + 2) % 27);
            } else if (a >= 'A' && a <= 'Z') {
                a = (char) ('A' + (a - 'A' + 2) % 27);
            }
            fraseFinal.append(a);
        }
        return fraseFinal.toString();
    }

    static String descifrar(String frase) {
        StringBuilder fraseDes = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            if (a >= 'a' && a <= 'z') {
                a = (char) ('a' + (a - 'a' - 2 + 27) % 27);
            } else if (a >= 'A' && a <= 'Z') {
                a = (char) ('A' + (a - 'A' - 2 + 27) % 27);
            }
            fraseDes.append(a);
        }
        return fraseDes.toString();
    }
}