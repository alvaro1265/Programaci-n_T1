package UT2.pruebas;

public class cadenas {

    public static void main(String[] args) {

        String h = "hola mundo";
        System.out.println(h.indexOf("mun     "));
        String cadenaCortada = h.substring(h.indexOf("mun"));
        System.out.println(cadenaCortada.trim());
        System.out.println("¿empieza en hola? " );

    }
}
