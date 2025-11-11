package arrays;

import java.util.Scanner;

public class Ejerccicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce los nombres en la agenda: ");
            String[] nombre = new String[]{scanner.next()};
        }

    }
}
