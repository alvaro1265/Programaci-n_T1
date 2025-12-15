package UT3.alumno;

public class Alumno {

    private String nombre;
    private  String apellidos;
    int numMatricula;

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String toString() {
        String numMatriculaSiHay = this.numMatricula > 0 ? String.valueOf(this.numMatricula) : "no tiene matricula";
        return "El alumno se llama " + this.nombre + (this.apellidos != null ? " " + this.apellidos : "")
                + " " + numMatriculaSiHay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
