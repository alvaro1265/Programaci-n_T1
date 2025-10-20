package Introducción;

public class ambito {
    public static void main(String[] args) {
        int edad = 74;
        if (edad >65) {
            System.out.println("Enhorabuena, Estas jubilado, Su billete a Benidorm");
            float pension = calculameLaPension(edad);
            System.out.println("Y su pensión es de: " + pension);
            System.out.println(edad);
        }
        // No se puede
        //System.out.println(pension);
    }
    static float calculameLaPension(int edadDeLaFuncion){
        edadDeLaFuncion++;
        return edadDeLaFuncion * 10;
    }

}
