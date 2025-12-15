package UT3;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return Math.PI * (radio * radio);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Un circulo de radio " + radio + " Con un perimetro de " + perimetro() + " Y un area de " + area();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
