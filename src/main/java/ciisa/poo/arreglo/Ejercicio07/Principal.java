package ciisa.poo.arreglo.Ejercicio07;

public class Principal {
    public static void main(String[] args) {
        int listaNumeros[] = new int[] { 1, 2, 3, 4, 5 };

        AnalisisNumeros analisis = new AnalisisNumeros(listaNumeros);

        System.out.println("La cantidad de pares en la lista es: " + analisis.CuentaNumeros(true));
        System.out.println("La cantidad de impares en la lista es: " + analisis.CuentaNumeros(false));
    }
}
