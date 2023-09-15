public class Auxiliar extends Recordatorio {

    float salario;
    final  double PI=3.14;

    public Auxiliar(String nombre, int edad,  float salario){
        super( nombre,edad);
        this.salario=salario;
    }
    // fUNCION
    public float recalculo(){

        return salario + 1000;
    }
    //procedimiento
    public void imprimir_salario(){
        System.out.println("el salario nuevo es "+salario);
    }

    @Override
    public String toString() {
        return "Auxiliar{" +
                "salario=" + salario +
                ", PI=" + PI +
                '}';
    }
}
