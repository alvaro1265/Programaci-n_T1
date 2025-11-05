package UT2.Ejercicios4;

/*
Haz programa que ordene alfabéticamente las letras de una frase.
El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
Ejemplo: Tecleando la palabra “hola”
Escribirá “ahlo”
El trabajo de ordenar la frase lo realizará un metodo llamado ordenar() al que se le pasará la frase y la retornará ordenada.
Este metodo realizará el trabajo de la siguiente manera:
Repetir tantas veces como letras tenga la frase
{
Obtener la letra menor
Añadir esa letra al resultado
Eliminar la letra de la frase original
}
El proceso de obtener la letra menor lo realizará un metodo llamado
obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.
Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro
metodo llamado eliminarLetra() al que se le pasa la frase y la letra a eliminar y nos da como resultado la frase modificada.
*/

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        scanner.close();

        String ordenada = ordenar(frase);
        System.out.println("Frase ordenada: " + ordenada);

    }

    static String ordenar(String frase) {
        String resultado = "";
        String copia = frase;
        int i = 0;
        while (i < frase.length()) {
            char menor = Letra(copia);
            if (menor != '\0') {
                resultado = resultado + menor;
                copia = eliminar(copia, menor);
            }
            i = i + 1;
        }
        return resultado;
    }

    static char Letra(String frase) {
        if (frase == null || frase.isEmpty()) {
            return '\0';
        }
        char min = '\0';
        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            if (!Character.isWhitespace(a)) {
                if (min == '\0' || a < min) {
                    min = a;
                }
            }
        }
        return min;
    }

    static String eliminar(String frase, char letra) {
        int pos = frase.indexOf(letra);
        String resultado;
        if (pos == -1) {
            resultado = frase;
        } else {
            resultado = frase.substring(0, pos) + frase.substring(pos + 1);
        }
        return resultado;
    }
}