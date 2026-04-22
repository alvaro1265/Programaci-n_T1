package UT6.ejercicios2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
El ayuntamiento de Toledo contrata a varios empleados para realizar la limpieza de parques y jardines de la ciudad. El capataz de la cuadrilla de limpieza anota cada día en un archivo los trabajadores que han acudido al trabajo, a fin de realizar al final de mes un informe con las jornadas de trabajo que hay que pagarle a cada empleado. El archivo donde el capataz realiza las anotaciones se llama peonadas.txt y contiene el formato:

        Fecha;Nombre1;Nombre2;Nombre3

        Debemos procesar el fichero y:
        Crear una carpeta con cada año.
        Dentro de cada año crear un fichero para cada trabajador llamado nombre_año_peonadas.txt
        Dentro de este fichero habrá un listado de meses, por ejemplo:
        Enero 6
        Febrero 4
        Marzo 7
        Abril 3
        Mayo 0
        Junio 0
        Julio 0
        Agosto 0
        Septiembre 17
        Octubre 4
        Noviembre 8
        Diciembre 12

        Así, quedaría por ejemplo:

        2025
        Juan_Luis_Gomez_peonadas.txt
        Marta_Gonzalez_peonadas.txt
        2024
 */
public class Peonada {

    public static void main(String[] args) {
        cargarArchivos();
    }

    public static void cargarArchivos() {
        Map<Integer, Map<String, int[]>> datosEmpleado = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("peonadas.txt"))) {
            String linea;

            while((linea = bufferedReader.readLine()) != null) {
                String[] trozos = linea.split(";");
                String[] fechaTrozos = trozos[0].split("/");

                int mes = Integer.parseInt(fechaTrozos[1]) - 1;
                Integer anyo = Integer.parseInt(fechaTrozos[2]);

                datosEmpleado.putIfAbsent(anyo, new HashMap<>());
                Map<String, int[]> mapaTrabajadores = datosEmpleado.get(anyo);

                System.out.println("AÑO " + anyo);

                for(int i = 1; i < trozos.length; i++){
                    mapaTrabajadores.putIfAbsent(trozos[i], new int[12]);
                    int[] meses = mapaTrabajadores.get(trozos[i]);
                    meses[mes]++;
                    System.out.println("Empleado " + trozos[i] + " meses " + Arrays.toString(meses));
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        generarArchivo(datosEmpleado);

    }

    public static void generarArchivo(Map<Integer, Map<String, int[]>> datosEmpleado) {
        try {

            String[] mesesNombre = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                    "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

            for (Integer anyo : datosEmpleado.keySet()) {
                Path rutaCarpeta = Paths.get(anyo.toString());
                if (!Files.exists(rutaCarpeta)) {
                    Files.createDirectory(rutaCarpeta);
                }

                Map<String, int[]> mapaTrabajadores = datosEmpleado.get(anyo);

                for (String trabajador : mapaTrabajadores.keySet()) {
                    int[] meses = mapaTrabajadores.get(trabajador);

                    String nombreArchivo = trabajador.replace(" ", "_") + "_" + anyo + "_peonadas.txt";

                    Path rutaArchivo = rutaCarpeta.resolve(nombreArchivo);

                    BufferedWriter bw = Files.newBufferedWriter(rutaArchivo);

                    for (int i = 0; i < 12; i++) {
                        bw.write(mesesNombre[i] + " " + meses[i]);
                        bw.newLine();
                    }

                    bw.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

