package UT6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CracionDeFicheros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();
        scanner.close();

        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) {
                archivo.createNewFile();
            } else {
                System.out.println(archivo.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo");
        }

    }
}
