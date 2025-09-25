package ejercicios1;
/*
Programa java que realice lo siguiente: declarar una variable N de tipo int,
una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación, muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N,
el valor numérico correspondiente al carácter que contiene la variable C.
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        int variableN = 5;
        double variableA = 3.56;
        char variableC = 'B';
        System.out.println(variableN + variableA);
        System.out.println(variableA - variableN);
        int unicode = (int) variableC;
        System.out.println(unicode);
    }
}
