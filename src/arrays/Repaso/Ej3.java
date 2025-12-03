package arrays.Repaso;

public class Ej3 {
    public static void main(String[] args) {
        int[] notas = {4, 9, 7, 5, 10};

        for (int i = 0; i < notas.length; i++){
            System.out.println("Notas " + i + " es: " + notas[i] + " ");
        }

        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = (double) suma / notas.length;
        System.out.println("Media: " + media);

    }
}
