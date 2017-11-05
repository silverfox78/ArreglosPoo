package ciisa.poo.arreglo.Ejercicio07;

public class AnalisisNumeros {
    int listaNumeros[];

    public AnalisisNumeros(int listaNumeros[]){
        this.listaNumeros = listaNumeros;
    }

    public int CuentaNumeros(boolean cuentaPares){
        int cantidad = 0;
        for(int i = 0; i < this.listaNumeros.length; i++){
            if(cuentaPares ? this.listaNumeros[i] % 2 == 0 : this.listaNumeros[i] % 2 != 0) {
                cantidad++;
            }
        }

        return cantidad;
    }
}
