package ciisa.poo.arreglo;

public class Ejercicio03 {
    private int numero;

    public Ejercicio03(int numero){
        this.numero = numero;
    }

    /*
        Determina la catindad de divisores del numero
     */
    private int CuentaDivisores(){
        int contador = 1;
        for(int i = 1; i <= this.numero / 2; i++){
            if(this.numero % i == 0){
                contador++;
            }
        }
        return contador;
    }

    /*
        Listar los divisores del numero
     */
    public int[] ObtieneDivisores(){
        int divisores[] = new int[this.CuentaDivisores()];
        int contador = 0;
        for(int i = 1; i <= this.numero / 2; i++){
            if(this.numero % i == 0){
                divisores[contador] = i;
                contador++;
            }
        }
        divisores[contador] = this.numero;
        return divisores;
    }
}
