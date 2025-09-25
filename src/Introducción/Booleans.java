package Introducción;

public class Booleans {
    public static void main(String[] args) {

        boolean tengoDinero = true;
        boolean tengounahoralibre = true;
        System.out.println(tengoDinero && tengounahoralibre);

        tengounahoralibre = false;
        System.out.println(tengoDinero && tengounahoralibre);

        boolean tengoefectivo = false;
        boolean tengotarjeta = true;

        System.out.println("puedo pagar: " + (tengoefectivo || tengotarjeta));

        boolean hagoejercicios = true;
        System.out.println("hagoejercicios: " + hagoejercicios);
        System.out.println("hagoejercicios: " + !hagoejercicios);
    }
}
