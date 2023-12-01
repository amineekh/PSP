package Ejercicio_CuentaBancaria;

public class HiloRetiro extends Thread{
    private CuentaBancaria cuenta;

    public HiloRetiro(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.retirar(150);
        }
    }
}
