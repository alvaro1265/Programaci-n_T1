package RepasoFunciones;

public class Ej1 {
    public static void main(String[] args) {
        saludar();

        int resultado = sumar(5 , 6);
        System.out.println("Suma " + resultado);
    }

    static void saludar() {
        System.out.println("Hola DAM1");
    }

    static int sumar(int a, int b) {
        return a + b;
    }
}
