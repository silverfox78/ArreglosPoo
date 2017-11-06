package ciisa.poo.arreglo.Ejercicio11;

public class Principal {
    public static void main(String[] args) {
        Alumno listaAlumnos[] = new Alumno[4];
        Alumno pepito = new Alumno("Pepito", new float[] { 1, 2, 3, 4 });
        listaAlumnos[0] = pepito;
        Alumno juanito = new Alumno("Juanito", new float[] { 3, 4, 3, 4 });
        listaAlumnos[1] = juanito;
        Alumno dieguito = new Alumno("Dieguito", new float[] { 5, 4, 5, 4 });
        listaAlumnos[2] = dieguito;
        Alumno doroteo = new Alumno("Doroteo", new float[] { 7, 7, 7, 7 });
        listaAlumnos[3] = doroteo;
        String nombreCurso = "Zexxion Z";

        Curso curso = new Curso(nombreCurso, listaAlumnos);
        System.out.println("La cantidad de alumnos con derecho a repeticion son: " + curso.ObtieneCantidadParaRepeticion());
    }
}
