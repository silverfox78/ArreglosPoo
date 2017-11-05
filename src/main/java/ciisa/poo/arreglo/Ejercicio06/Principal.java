package ciisa.poo.arreglo.Ejercicio06;

public class Principal {
    public static void main(String[] args) {
        int cantidadPares = 4;
        Pares pares = new Pares(cantidadPares);
        System.out.println("La suma de los primeros [" + cantidadPares + "] es: " + pares.SumaDePares());
    }
}
