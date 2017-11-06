package ciisa.poo.arreglo.Ejercicio12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    private enum Opcion{
        SUMAR,
        RESTAR,
        MULTIPLICAR,
        DIVIDIR,
        SALIR
    }

    public static void GeneraMenu(){
        System.out.println("Puntos en el espacio");
        System.out.println("====================\n");
        System.out.println("1.- Sumar dos puntos cartesianos.");
        System.out.println("2.- Restar dos puntos cartesianos.");
        System.out.println("3.- Multiplicar dos puntos cartesianos.");
        System.out.println("4.- Dividir dos puntos cartesianos.");
        System.out.println("5.- Salir.");
    }

    public static Opcion DeterminaOpcion()throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);
        String opcion = "";
        boolean leerOpcion = true;
        while (leerOpcion){
            System.out.println("\nIngrese una opcion valida [1 a 5]:");
            opcion = entrada.readLine();
            leerOpcion = !OpcionValida(opcion);
        }

        switch (opcion){
            case "1":
                return Opcion.SUMAR;
            case "2":
                return Opcion.RESTAR;
            case "3":
                return Opcion.MULTIPLICAR;
            case "4":
                return Opcion.DIVIDIR;
            default:
                return Opcion.SALIR;
        }
    }

    private static boolean OpcionValida(String opcion) {
        switch (opcion){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                return true;
            default:
                System.out.println("ERROR: Ha ingresado una opcion invalida.");
                return false;
        }
    }

    public static boolean RealizaAccion(Opcion opcion) throws IOException {
        System.out.print("\033[H\033[2J");
        if(opcion == Opcion.SALIR){
            System.out.println("Nos vemos...");
            return false;
        }

        System.out.println("Para la accion [" + opcion.toString().toUpperCase() + "] debe ingresar dos puntos validos:");
        float coordinadaX = 0, coordinadaY = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(isr);

        System.out.println("\nIngrese la coordinada X del primer punto:");
        coordinadaX = Float.parseFloat(entrada.readLine());
        System.out.println("\nIngrese la coordinada Y del primer punto:");
        coordinadaY = Float.parseFloat(entrada.readLine());
        Punto primero = new Punto(coordinadaX, coordinadaY);

        System.out.println("\nIngrese la coordinada X del segundo punto:");
        coordinadaX = Float.parseFloat(entrada.readLine());
        System.out.println("\nIngrese la coordinada Y del segundo punto:");
        coordinadaY = Float.parseFloat(entrada.readLine());
        Punto segundo = new Punto(coordinadaX, coordinadaY);

        Punto resultado = null;
        switch (opcion){
            case SUMAR:
                resultado = primero.Sumar(segundo);
                break;
            case RESTAR:
                resultado = primero.Restar(segundo);
                break;
            case MULTIPLICAR:
                resultado = primero.Multiplicar(segundo);
                break;
            case DIVIDIR:
                resultado = primero.Dividir(segundo);
                break;
        }

        System.out.println("\n\nEl punto resultante es : [ " + resultado.getCoordinadaX() + " , " + resultado.getCoordinadaY() + "].\n\n\n");
        return true;
    }
}
