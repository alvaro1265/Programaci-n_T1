package UT2.pruebas;

public class ErrorMemoria {

    public static void main(String[] args) {

        String s = "";
        for (int i = 0; i < 100000; i++){
            s += "hola";
        }
        for (int i = 0; i < 100000; i++){
            s += s;
        }
    }
}
