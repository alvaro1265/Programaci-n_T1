package UT2.Ejercicios4;

/*
Realiza varios métodos para convertir un numero decimal en binario, octal o hexadecimal.
Para convertir un numero a binario se hacen divisiones entre 2 y se guardan los restos;
para convertir a octal se divide entre 8 y para convertir a hexadecimal se divide por 16
(si el resto es 10 se sustituye por una A, si es 11 se sustituye por B, 12 -> C,&, 15->F).
Cada metodo recibe un número entero y da como resultado un String con el número convertido.
Ejemplo:
Escribe un número: 58
Dará como resultado:
Binario : 111010
Octal : 72
Hexadecimal : 3ª
*/

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero en decimal: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A que sistema lo quieres combretir: (binario/octal/hexadecimal)");
        String Con = scanner.nextLine().toLowerCase();

        scanner.close();

        String binario = binario(num);
        String octal = octal(num);
        String hexadecimal = hexadecimal(num);

        switch (Con) {
            case "binario":
                System.out.println("El numero " + num + " en binario es: " + binario);
                break;
            case "octal":
                System.out.println("El numero " + num + " en octal es: " + octal);
                break;
            case "hexadecimal":
                System.out.println("El numero " + num + " en Hexadecimal es: " + hexadecimal);
                break;
        }
    }

    static String binario(int binario) {
        if (binario == 0) {
            return "0";
        }
        StringBuilder bin = new StringBuilder();
        while (binario > 0) {
            int resultado = binario % 2;
            bin.insert(0, resultado);
            binario = binario / 2;
        }
        return bin.toString();
    }

    static String octal(int octal) {
        if (octal == 0) {
            return "0";
        }
        StringBuilder oct = new StringBuilder();
        while (octal > 0) {
            int resultado = octal % 8;
            oct.insert(0, resultado);
            octal = octal / 8;
        }
        return oct.toString();
    }

    static String hexadecimal(int hexadecimal) {
        if (hexadecimal == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        char[] simHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (hexadecimal > 0) {
            int resultado = hexadecimal % 16;
            hex.insert(0, simHex[resultado]);
            hexadecimal = hexadecimal / 16;
        }
        return hex.toString();
    }

}