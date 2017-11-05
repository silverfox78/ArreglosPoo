package ciisa.poo.arreglo;

import java.util.Random;

public class Ejercicio04 {
    public class Alumno{
        private String nombre;
        private float notas[];

        public Alumno(String nombre, float notas[]){
            this.nombre = nombre;
            this.notas = notas;
        }

        public float Promedio(){
            float sumaNotas = 0;
            for (int i = 0; i<this.notas.length; i++){
                sumaNotas+=this.notas[i];
            }
            return sumaNotas / this.notas.length;
        }
    }

    public class Curso{
        private Alumno[] alumnos;
        private String seccion;

        public Curso(String seccion, Alumno[] alumnos){
            this.seccion = seccion;
            this.alumnos = alumnos;
        }

        public float Promedio(){
            float sumaNotas = 0;
            for (int i = 0; i<this.alumnos.length; i++){
                sumaNotas+=this.alumnos[i].Promedio();
            }
            return sumaNotas / this.alumnos.length;
        }
    }

    private int cantidadAlumnos;
    private String nombreCurso;
    private Curso curso;
    private Alumno[] listaAlumnos;

    public  Ejercicio04(String nombreCurso, int cantidadAlumnos){
        this.nombreCurso = nombreCurso;
        this.cantidadAlumnos = cantidadAlumnos;
        this.listaAlumnos = new Alumno[this.cantidadAlumnos];
        for (int i = 0; i < this.cantidadAlumnos; i++){
            listaAlumnos[i] = new Alumno("AlumnoN" + i, this.GeneraNotas());
        }
        this.curso = new Curso(this.nombreCurso, this.listaAlumnos);
    }

    private float[] GeneraNotas(){
        int totalNotas = 1 + (int)(Math.random() *9);
        float notas[] = new float[totalNotas];
        for (int i=0; i < totalNotas; i++){
            notas[i] = 1 + (int)(Math.random() * 6);
        }
        return notas;
    }

    public float ObtienePromedioCurso(){
        return this.curso.Promedio();
    }
}


