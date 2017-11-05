package ciisa.poo.arreglo.Ejercicio08;

public class Principal {
    public static void main(String[] args) throws Exception {
        int listaNumeros[] = new int[] { 3, 7, 1, 4, 9, 2, 8 };

        Extremos analisisExtremos = new Extremos(listaNumeros);

        System.out.println("De la lista, el numero inferior es: " + analisisExtremos.DeterminaExtremo(true) + " y el superior es: " + analisisExtremos.DeterminaExtremo(false));
    }
}
