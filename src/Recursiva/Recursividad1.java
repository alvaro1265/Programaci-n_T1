package Recursiva;

/*
Crea una funcin recursiva que obtenga la suma de N numeros.
N se pasa como parametro.
La suma va de N a 1.
*/

public class Recursividad1 {

    public static void main(String[] args) {
        String hola = "Hola";

        cadenilla(hola);
    }

    static void cadenilla(String cadena)  {
        System.out.println(cadena.charAt(0));
        String subcadena = cadena.substring(1);
        if (subcadena.length() > 0) {
            cadenilla(subcadena);
        }
    }
}
