package arrays;

import java.util.Arrays;

public class arrayDeArrays {
    public static void main(String[] args) {

        String[] datosF = {"Felipe", "Garcia", "Avda. La palmera 1"};
        String[] datosL = {"Laura", "Rodriguez", "Calle del Chopo 43"};
        String[] datosA = {"Paco", "Fiestas", "El grande S/n"};

        System.out.println(Arrays.toString(datosF));
        System.out.println(Arrays.toString(datosL));
        System.out.println(Arrays.toString(datosA));

        String[][] alumnos = {datosF, datosL, datosA};
        //alumnos = new String[3][3];
        System.out.println("Vamos a imprimir el array de arrays");
        for (String[] alumno : alumnos) {
            System.out.println(Arrays.toString(alumno));
        }
    }
}
