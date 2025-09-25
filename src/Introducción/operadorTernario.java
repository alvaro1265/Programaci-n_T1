package Introducción;

public class operadorTernario {
    public static void main(String[] args) {

        boolean tengoefectivo = false;
        boolean tengotargeta = true;

        String puedopagar = tengoefectivo && tengotargeta ? "sí" : "no";
        System.out.println("puedo pagar " + puedopagar);
    }
}
