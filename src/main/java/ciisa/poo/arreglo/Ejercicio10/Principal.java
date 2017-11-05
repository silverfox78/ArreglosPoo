package ciisa.poo.arreglo.Ejercicio10;

public class Principal {
    public static void main(String[] args) {
        float listaNotas[] = new float[] { 4, 5, 6, 7, 4.5f, 1, 2, 3, 5f, 3.9f };

        Notas analisisNotas = new Notas(listaNotas);

        System.out.println("El porcentaje de reprobados es: " + analisisNotas.Porcentaje(false) + "%");
    }
}
