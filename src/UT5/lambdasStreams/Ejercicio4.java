package UT5.lambdasStreams;

/*
Crea una lista con los números: {10, 20, 30, 40, 50}.
Calcular la suma y el promedio de todos los números.
Convierte el stream a un IntStream usando .mapToInt(n -> n) y utiliza los métodos .sum() y .average().
*/

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ejercicio4 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        int suma = numeros.stream()
                .mapToInt(n -> n)
                .sum();

        OptionalDouble porcentaje = numeros.stream()
                .mapToInt(n -> n)
                .average();

        System.out.println("Suma: " + suma);
        System.out.println("Porcentaje: " + porcentaje.getAsDouble());
    }
}
