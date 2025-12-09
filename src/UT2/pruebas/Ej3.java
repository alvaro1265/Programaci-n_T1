package UT2.pruebas;

public class Ej3 {

    public static void main(String[] args) {

        StringBuilder cadena = new StringBuilder();
        for (int i = 1; i <= 10; i++){
             cadena.append(i);
             if (i < 10) {
                 cadena.append("-");
             }
        }
        System.out.println(cadena);
    }
}
