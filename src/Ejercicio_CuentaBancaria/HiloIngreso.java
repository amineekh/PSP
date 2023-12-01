package Ejercicio_CuentaBancaria;

public class HiloIngreso  extends Thread{

    private CuentaBancaria cuenta;

    public HiloIngreso(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.ingreso(100);
        }
    }

}
