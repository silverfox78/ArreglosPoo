package ciisa.poo.arreglo.Ejercicio11;

public class Curso {
    private String nombreCurso;
    private Alumno listaAlumnos[];

    private float notaMinimaAprobacion = 4;
    private float notaMinimaRepeticion = 3.5f;

    public Curso(String nombreCurso, Alumno listaAlumnos[]){
        this.nombreCurso = nombreCurso;
        this.listaAlumnos = listaAlumnos;
    }

    public int ObtieneCantidadParaRepeticion(){
        int cantidad = 0;
        for (int i = 0; i < this.listaAlumnos.length; i++){
            if((this.listaAlumnos[i].ObtienePromedio() >= notaMinimaRepeticion) && (this.listaAlumnos[i].ObtienePromedio() < notaMinimaAprobacion)){
                cantidad++;
            }
        }
        return cantidad;
    }
}
