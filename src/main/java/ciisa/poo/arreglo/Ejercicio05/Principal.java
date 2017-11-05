package ciisa.poo.arreglo.Ejercicio05;

public class Principal {

    public static void main(String[] args) {
        float ladosError[] = new float[] { 1, 2, 3 };
        Triangulo trianguloError = new Triangulo(ladosError);

        float ladosOK[] = new float[] { 5, 5, 5 };
        Triangulo trianguloOK = new Triangulo(ladosOK);

        System.out.println("El primer triangulo: " + (trianguloError.EsEquilatero() ? "Es Equilatero." : "No es Equilatero."));
        System.out.println("El segundo triangulo: " + (trianguloOK.EsEquilatero() ? "Es Equilatero." : "No es Equilatero."));
    }

}
