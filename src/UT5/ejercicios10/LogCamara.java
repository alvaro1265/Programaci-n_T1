package UT5.ejercicios10;

public class LogCamara extends Log {
    String resolucion;
    public LogCamara(int id, String ip, String loc, String res) {
        super(id, ip, loc);
        this.resolucion = res;
    }
}
