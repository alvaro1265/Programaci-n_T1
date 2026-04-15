package UT6.ejercicios1;

/*
Objetivo: Leer archivos línea a línea y realizar operaciones con cadenas de texto.

Contexto: Tienes un archivo poema.txt con varias líneas de texto (puedes crearlo a mano previamente).

Tarea: Lee el archivo completo utilizando un BufferedReader o la clase Scanner.

Acción:

Muestra el contenido exacto por consola.

Cuenta y muestra al final cuántas líneas en total tiene el archivo.

Cuenta y muestra cuántas veces aparece la vocal "a" (mayúscula o minúscula) en todo el texto.
*/

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("poema.txt"))) {
            String lineas;
            while ((lineas = reader.readLine()) !=null) {
                System.out.println(lineas);
            }
        } catch (IOException e) {
            System.err.println("Error: no se puede leer la linea " + e.getMessage());
        }

    }
}
