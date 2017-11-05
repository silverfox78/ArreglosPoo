package ciisa.poo.arreglo.Ejercicio10;

public class Notas {
    private float notaMinima = 4;
    private float listaNotas[];

    public Notas(float listaNotas[]){
        this.listaNotas = listaNotas;
    }

    public float Porcentaje(boolean Aprobados){
        int contador = 0;
        for (int i = 0; i < this.listaNotas.length; i++){
            if(Aprobados ? this.listaNotas[i] >= notaMinima : this.listaNotas[i] < notaMinima){
                contador++;
            }
        }

        return ((float) contador * 100) / this.listaNotas.length;
    }
}
