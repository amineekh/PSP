package Ejercicio_CuentaBancaria;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void ingreso(double cantidad) {
        saldo += cantidad;
        System.out.println("Ingreso de " + cantidad + ". Saldo actual: " + saldo);
    }

    public synchronized  void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar " + cantidad);
        }
    }

    public synchronized  double consultarSaldo() {
        return saldo;
    }
}
