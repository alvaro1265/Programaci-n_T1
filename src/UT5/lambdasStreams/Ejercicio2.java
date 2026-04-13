package UT5.lambdasStreams;

/*
Tenemos una lista de nombres de alumnos: {"ana", "luis", "guzmán", "marta"}.
Convierte todos los nombres a mayúsculas.
Usa .stream().map(...) y luego recoge el resultado en una nueva List<String> usando .toList() (o Collectors.toList()).
Muestra la nueva lista por pantalla.
*/

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> alumnos = Arrays.asList("ana", "luis", "guzmán", "marta");

        List<String> nombreMayus = alumnos.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList();

        System.out.println(nombreMayus);

    }
}
