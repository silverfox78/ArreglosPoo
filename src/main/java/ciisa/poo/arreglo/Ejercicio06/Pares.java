package ciisa.poo.arreglo.Ejercicio06;

public class Pares {
    private int cantidadPares;
    private int listaPares[];

    public Pares(int cantidadPares){
        this.cantidadPares = cantidadPares;
        listaPares = new int[this.cantidadPares];
        this.GeneraListaPares();
    }

    private void GeneraListaPares(){
        int valorTemporal = 2;
        for (int i = 0; i < this.cantidadPares; i++){
            this.listaPares[i] = valorTemporal * (i + 1);
        }
    }

    public int SumaDePares() {
        int suma = 0;
        for (int i = 0; i < this.cantidadPares; i++){
            suma += this.listaPares[i];
        }

        return suma;
    }
}
