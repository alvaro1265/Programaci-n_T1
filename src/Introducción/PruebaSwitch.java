package Introducción;

import java.util.Scanner;

public class PruebaSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una posición");
        int posicion = scanner.nextInt();

        switch (posicion) {
            case 1:
                System.out.println("david");
                break;
            case 2:
                System.out.println("Antonio");
                break;
            case 3:
                System.out.println("Juan Carlos");
                break;
            default:
                System.out.println("Gabriel");
                break;
        }

        scanner.close();
    }
}
