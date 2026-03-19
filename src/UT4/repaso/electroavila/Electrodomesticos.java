package UT4.repaso.electroavila;

public class Electrodomesticos {

    public enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS};

    private double precioBase;
    private Color color;
    private char consumoEnergetico;
    private int peso;

    public Electrodomesticos(double precioBase, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = Color.BLANCO;
        this.peso = peso;
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
