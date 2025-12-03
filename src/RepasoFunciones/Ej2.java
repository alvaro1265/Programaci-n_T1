package RepasoFunciones;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println(areaRectangulo(3.25, 4.5));
        System.out.println(esPar(4));

    }
    static double areaRectangulo(double base, double altura){
        return base * altura;
    }
    static boolean esPar(int n){
        return n % 2 == 0;
    }
}
