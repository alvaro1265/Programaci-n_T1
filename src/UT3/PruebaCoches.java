package UT3;

public class PruebaCoches {

    public static void main(String[] args) {

        Coche cocheLaura = new Coche("5554ABF", "azul", "Ford");
        System.out.println(cocheLaura);
        cocheLaura.conducir(120);
        System.out.println(cocheLaura);

        Coche cocheMartin = cocheLaura;
        cocheMartin.conducir(100);
        System.out.println(cocheMartin);

        Coche cocheJoseLuis = new Coche("4546BDH", "verde", 3400, "Opel");
        System.out.println(cocheJoseLuis);

        cocheMartin = new Coche ("7865FDM","rojo", 45000,"Peugeot");
        System.out.println("Martin :: "+ cocheMartin);
        System.out.println("Laura :: " + cocheLaura);
        System.out.println(cocheMartin);
        cocheMartin.conducir (100);
        System.out.println("Martin :: " + cocheMartin);
        System.out.println("Laura :: " + cocheLaura);

        cocheJoseLuis = new Coche("8795FGH", "rojo", 12000, "Ferrari");
        System.out.println(cocheJoseLuis);
    }
}
