package UT5.lambdasStreams;

/*
Dada una lista de palabras: {"Java", "Programación", "Stream", "Código", "DAM"}.
Encuentra la palabra que tiene más caracteres.
Pista: Usa el metodo .max() pasando un Comparator basado en la longitud de la cadena (String::length).
Imprime la palabra encontrada (ten en cuenta que max devuelve un Optional).
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Java", "Programación", "Stream", "Código", "DAM");

        Optional<String> num = palabras.stream()
                .max(Comparator.comparing(String::length));

        System.out.println(num);

    }
}
