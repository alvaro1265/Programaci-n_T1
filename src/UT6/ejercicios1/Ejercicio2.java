package UT6.ejercicios1;

/*
Objetivo: Practicar la escritura de texto añadiendo contenido al final del archivo (append).

Tarea: Crea un programa que funcione como un diario. Debe pedir al usuario por consola que introduzca frases.

Acción:
1. Cada frase introducida se debe guardar en un archivo llamado diario.txt.
2. El programa debe seguir pidiendo frases hasta que el usuario escriba la palabra "FIN".
3. Asegúrate de que si ejecutas el programa dos veces, las frases nuevas se añadan debajo de las antiguas sin borrar las anteriores (modo append).
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path ruta = Paths.get("diario.txt");
        System.out.println("Vamos a escribir en el diario :D ...");
        List<String> cosas = new ArrayList<>();
        int numLineas = 1;

        do {
            System.out.println("Linea " + numLineas + ":");
            cosas.add(sc.nextLine());
            numLineas++;
        } while (!cosas.getLast().equalsIgnoreCase("fin"));

        cosas.removeLast();

        try {
            Files.write(ruta, cosas, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("ERROR:: EL archivo no funciona " + e.getMessage());
        }

        sc.close();
    }
}
