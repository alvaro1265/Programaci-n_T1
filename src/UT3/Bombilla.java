package UT3;

public class Bombilla {
    boolean encendida;
    String casquillo;
    int temperatura;

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

//    public void estado() {
//        this.encendida ? "Encendida" : "Apagada";
//    }
}
