import java.util.Scanner;

public class EjemploExamen {

/*
500€
>18 && <25     +20%
>35 && <55     -10%     &&    !accidentes
>65            +10%
>65 && accidentes +30%
precio final seguro
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int precioinicial = 500;
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Has tenido accidentes: true/false");
        boolean accidente = scanner.nextBoolean();

        double precioSeguro = preciofinal(precioinicial, edad, accidente);
        System.out.println("El precio del seguro seria: " + precioSeguro + " € ");
        System.out.println("Quiere contratarlo? true/false");
        boolean contratarlo = scanner.nextBoolean();
        ContratarSeguros(contratarlo);

        scanner.close();
    }
    static double preciofinal (double precioinicial, int edad, boolean accidente) {
        if (edad <= 18){
            System.out.println("edad no valida");
        } else if (edad < 25){
            return precioinicial + (precioinicial * 20 / 100);
        } else if (edad > 35 && edad < 55 && !accidente) {
            return precioinicial - (precioinicial * 10 / 100);
        } else if (edad > 65 && !accidente) {
            return precioinicial + (precioinicial * 10 / 100);
        } else if (edad > 65) {
            return precioinicial + (precioinicial * 30 / 100);
        }
        return precioinicial;
    }
    static void ContratarSeguros(boolean contratar) {
        if (contratar) {
            System.out.println("Seguro contratado");
        } else {
            System.out.println("Contratacion cancelada");
        }
    }
}
