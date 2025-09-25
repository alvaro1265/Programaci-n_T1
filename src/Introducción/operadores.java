package Introducción;

public class operadores {
    public static void main(String[] args) {

        // Operadores aritmeticos
        /*
            Entrada número
            Salida número
         */
        int numero1 = 13;
        numero1 = numero1 + 2;
        numero1 = numero1 * 2;
        numero1 = numero1 - 50 / 2;
        System.out.println("numero1 vale " + numero1);
        numero1 = numero1 + 5;

        //Ahora numero1 vale 10
        int numero2 = numero1 % 3;
        System.out.println(numero2);

        // Operadores de asignación
        int otroNumero = 3;
        otroNumero -= 2;
        System.out.println("otroNumero: " + otroNumero);

        //Operadores de incremento
        int edad = 22;
        System.out.println("edad1: " + edad);
        edad++;
        System.out.println("edad2: " + edad);
        System.out.println("edad3: " + ++edad);
        System.out.println("edad4: " + edad);


    }
}
