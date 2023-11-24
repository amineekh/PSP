package Ejercicio;

public class main {

    //ejmplo 4:
    private  static  final int num_hilos=10;
    private  static  final int cuenta_total=10000;

    public static void main(String[] args) {
        Contador c= new Contador();
        Thread[] hilos = new Thread[num_hilos];
        for (int  i=0; i<num_hilos; i++){
          Thread th = new Thread((Runnable) new hiloEjemplo4(i, cuenta_total / num_hilos, c));
          th.start();
          hilos[i]=th;

        }

        for (Thread h: hilos){
            try {
                h.join();
            }catch (InterruptedException e){

            }
        }

        System.out.printf("cuenta globals: %n", c.getCuenta());

    }
}
