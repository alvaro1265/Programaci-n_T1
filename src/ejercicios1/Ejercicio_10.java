package ejercicios1;

/*
Programa Java que declare una variable A de tipo entero y asígnale un valor.
A continuación, muestra un mensaje indicando si A es par o impar.
Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
public class Ejercicio_10 {
    public static void main(String[] args) {
        int A = 80;

        System.out.println((A % 2 == 0) ? "Es par" : "Es impar");
    }
}
