package UT2.pruebas;

import java.util.Locale;

public class Ej2 {

    public static void main(String[] args) {

        String palabra = "java es facil";

        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.replace("facil", "poderoso"));
        System.out.println(palabra.substring(0, 4));
        String inver = new StringBuilder(palabra).reverse().toString();
        System.out.println(inver);
    }
}
