package Ejercicio_CuentaBancaria;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        HiloIngreso hiloIngreso = new HiloIngreso(cuenta);
        HiloRetiro hiloRetiro = new HiloRetiro(cuenta);

        hiloIngreso.start();
        hiloRetiro.start();

        hiloIngreso.join();
        hiloRetiro.join();

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}