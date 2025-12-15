package UT3.alumno;

public class EjemploAlumno {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("jose Luis", "garcia");
        System.out.println(alumno);
        Alumno alumno2 = new Alumno("martin", "hernandez");
        alumno2.numMatricula = 17;
        System.out.println(alumno2);
    }


}
