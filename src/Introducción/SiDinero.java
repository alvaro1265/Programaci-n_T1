package Introducción;

import java.util.Scanner;

public class SiDinero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto dinero tienes: ");
        double dinero = scanner.nextDouble();
        if (dinero >= 7) {
            System.out.println("Cocacola & Bocadillo");
        } else if (dinero >= 5) {
            System.out.println("Agua + Bocata");
        } else if (dinero >= 2) {
            System.out.println("Cocacola");
        } else {
            System.out.println("Agua");
        }
        scanner.close();
    }
}
