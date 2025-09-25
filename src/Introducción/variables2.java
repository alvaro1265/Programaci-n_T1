package Introducción;

public class variables2 {
    public static void main(String[] args) {

        long dinero = 1000000000000000000L;

        float saldo = 123456.89f;

        System.out.println(dinero);

        /*
        no se puede encajar decimal en entero

        int numero = 1000f;
        */

        double numero2 = 457.24f;

        double cantidad = -124;

        final  int notafindecurso;
        int examen1 = 8;
        double examen2 = 5.4;
        double media = ( examen1 + examen2 ) / 2;
        System.out.println("La media sería " + media);

        //casting
        notafindecurso = (int) media;
        System.out.println("La nota fin de curso sería " + notafindecurso);


        //caracteres
        char inicial = 'G';

        System.out.println("Tu inicial es " );
    }
}
