package RepasoFunciones;

public class Ambitos {

    public static void main(String[] args) {

        int numero = 3;
        hazAlgo(numero);

        System.out.println("numero vale " + numero);
    }

    static  void hazAlgo(int num) {
        num++;
        System.out.println("num vale " + num);
    }
}
