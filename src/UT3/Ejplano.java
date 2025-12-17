package UT3;

public class Ejplano {

    public static void main(String[] args) {
        plano puntoA = new plano(100, 200);
        plano puntoB = new plano(400, 800);
        double distancia = puntoA.distancia(puntoB);
        System.out.println("La distancia seria: " + distancia);
    }
}
