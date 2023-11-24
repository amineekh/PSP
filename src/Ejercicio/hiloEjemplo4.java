package Ejercicio;

public class hiloEjemplo4 {

    int numhilo, miParte, miCuenta=0;

    private final Contador cnt;

    public  int getMicuenta(){
        return  miCuenta;
    }

    public hiloEjemplo4(int numhilo, int miParte, Contador cnt) {

        this.numhilo = numhilo;
        this.miParte = miParte;
        this.miCuenta= miCuenta;

        this.cnt = cnt;
    }

    public  void run(){
        for(int i=0; i<miParte; i++){
            this.cnt.incrementa();
            miCuenta++;
        }

        System.out.printf("el hilo: %s ha terminado, mi cuanta es: %d\n", this.numhilo, getMicuenta());
    }
}
