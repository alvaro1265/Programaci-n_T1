import java.util.Scanner;

/*
f. edad
   accidentes
   tipo (3º, t-odo riesgo)
   antiguedad
   edad coche
   color coche
*/

public class prueba2 {
    public static void main(String[] args) {


    }
    static int prcioSeguro(int edad, boolean accidentes, int antiguedad, int edadCoche) {
        double precioBase = 100;

        String[] tipo = new String[] {"A terceros", "todo riesgo"};
        String[] color = new String[] {"Blanco", "Negro"};

        if (edad <= 17 || edad >= 130) {
            System.out.println("Edad no valida.");
        } else if (edad > 18) {
            precioBase = precioBase * 20 / 100;
        }
        if (edad > 25) {
            precioBase = precioBase * 10 / 100;
        }
        if (edad >= 65) {
            precioBase = precioBase * 50 / 100;
        }

        if (accidentes) {
            precioBase = precioBase * 30 / 100;
        }

        if (antiguedad > 5) {
            precioBase -= precioBase * 5 / 100;
        }

        if (edadCoche > 5) {
            precioBase -= precioBase * 10 / 100;
        }
        if (edadCoche > 10) {
            precioBase = precioBase * 5 / 100;
        }
        if (edadCoche > 15) {

        }


        return edad;
    }

}
