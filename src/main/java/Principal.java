import ciisa.poo.arreglo.Ejercicio01;
import ciisa.poo.arreglo.Ejercicio02;
import ciisa.poo.arreglo.Ejercicio03;
import ciisa.poo.arreglo.Ejercicio04;

public class Principal {
    public static void main(String[] args) {
        /*
        Ejercicio N1
        String cadena = "Ae236udd123";
        Ejercicio01 ejemplo = new Ejercicio01(cadena);
        System.out.println("La cadena original es: " + cadena);
        char resultado[] = ejemplo.RecuperaDatosValidos();
        for (int i = 0; i < resultado.length; i++){
            System.out.println(i + ".- Dato: " + resultado[i]);
        }*/

        /*
        Ejercicio N2
        Ejercicio02 ejemplo = new Ejercicio02(32, false);
        System.out.println("La temperatura en Celcius es: " + ejemplo.ObtieneTemperaturaCelcius());
        System.out.println("La temperatura en Fahrenheit es: " + ejemplo.ObtenerTemperaturaFahrenheit());
         */

        /*
        Ejercio N3
        int numero = 130;
        Ejercicio03 ejemplo = new Ejercicio03(numero);
        System.out.println("Los divisores del numero: " + numero);
        int divisores[] = ejemplo.ObtieneDivisores();
        for(int i=0; i<divisores.length;i++){
            System.out.println(divisores[i]);
        }
        */

        Ejercicio04 ejemplo = new Ejercicio04("BlaBla", 35);
        System.out.println("El promedio del curso es: " + ejemplo.ObtienePromedioCurso());
    }
}
