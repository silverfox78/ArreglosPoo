package ciisa.poo.arreglo.Ejercicio09;

public class Extremos {
    private int listaNumeros[];

    public  Extremos(int listaNumeros[]){
        this.listaNumeros = listaNumeros;
    }

    public int DeterminaExtremo(boolean esInferior) throws Exception{
        if(this.listaNumeros.length <= 0){
            throw new Exception("No se puede determinar el valor " + (esInferior ? "Inferior" : "Superior"));
        }

        if(this.listaNumeros.length == 1){
            return this.listaNumeros[0];
        }

        int retorno = this.listaNumeros[0];

        for(int i = 1; i < this.listaNumeros.length; i++){
            if(esInferior ? retorno > this.listaNumeros[i] : retorno < this.listaNumeros[i]){
                retorno = this.listaNumeros[i];
            }
        }

        return retorno;
    }

    public float DeterminaPromedio() throws Exception {
        if(this.listaNumeros.length <= 0){
            throw new Exception("No se puede determinar el valor del promedio.");
        }

        if(this.listaNumeros.length == 1){
            return this.listaNumeros[0];
        }

        int suma = 0;
        for (int i = 0; i < this.listaNumeros.length; i++){
            suma += this.listaNumeros[i];
        }
        return (float)suma / this.listaNumeros.length;
    }
}
