package ciisa.poo.arreglo.Ejercicio11;

public class Alumno {
    private String nombre;
    private float listaNotas[];

    public Alumno(String nombre, float listaNotas[]){
        this.nombre = nombre;
        this.listaNotas = listaNotas;
    }

    public float ObtienePromedio(){
        float suma = 0;
        for(int i = 0; i < this.listaNotas.length; i++){
            suma += this.listaNotas[i];
        }
        return suma / this.listaNotas.length;
    }
}
