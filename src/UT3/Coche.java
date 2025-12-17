package UT3;

public class Coche {

    static int numeroObjetos = 0;

    private String matricula;
    private String color;
    private String marca;
    private double km;

    public void conducir(int cuantosKmConduces) {
        km += cuantosKmConduces;
    }

    public void pintar(String nuevoColor) {
        color = nuevoColor;
    }

    public Coche(String matricula, String color, double km, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.km = km;
        this.marca = marca;
        numeroObjetos++;
    }

    public Coche(String matricula, String color, String marca) {
        this(matricula, color , 0, marca);
    }

    @Override
    public String toString() {
        return "(" + numeroObjetos + ")" + "coche de marca " + marca + " y color " + color + " con " + km + " km";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
