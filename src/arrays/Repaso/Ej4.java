package arrays.Repaso;

public class Ej4 {
    public static void main(String[] args) {
        int[] notas = {4, 9, 7, 5, 10};

        int contador = 0;
        for (int nota : notas){
            if (nota >= 5) {
                contador++;
            }
        }

        System.out.println("Las notas mayores de 5 son: " + contador);

    }
}
