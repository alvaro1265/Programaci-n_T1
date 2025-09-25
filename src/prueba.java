import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero");
        int A = scanner.nextInt();
        System.out.println((A % 2 == 0) ? "Es par" : "Es impar");

    }
}
