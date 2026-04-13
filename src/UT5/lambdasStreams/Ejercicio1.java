package UT5.lambdasStreams;

/*
Partimos de una lista de notas: List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);
Utiliza un Stream para filtrar las notas que sean mayores o iguales a 5.
Imprime cada nota aprobada utilizando el metodo .forEach() con una referencia a metodo o una lambda.
Resultado esperado: 8, 5, 10, 7.
*/

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<Integer> notas = Arrays.asList(3, 8, 5, 2, 10, 7, 4);

        notas.stream()
                .filter(nota -> nota >= 5)
                .forEach(System.out::println);
    }
}
