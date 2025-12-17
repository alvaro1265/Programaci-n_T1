package UT3;

/*
Se desea llevar un control del estado de una cuenta corriente.
La cuenta corriente está caracterizada por su saldo y
sobre ella se pueden realizar tres tipos de operaciones:
saldo: devuelve el saldo de la cuenta (puede ser negativo).
imposición (cantidad): ingresa en la cuenta una cantidad de dinero.
reintegro (cantidad): saca de la cuenta una determinada cantidad de dinero.
Supón que la cuenta corriente tiene inicialmente un saldo de un euro
y cree una clase CuentaCorriente con toda la funcionalidad necesaria.
Escriba una clase con un metodo main que pruebe la funcionalidad descrita.
 */

public class cuenta {

    private double saldo;


    public cuenta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public cuenta() {
        this.saldo = 1.0;
    }

    public void imposicion(double cantidad) {
        saldo += cantidad;
    }

    public void reintegro(double cantidad) {
        saldo -= cantidad;
    }

}
