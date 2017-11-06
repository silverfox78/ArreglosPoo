package ciisa.poo.arreglo.Ejercicio12;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        boolean seguirProcesando = true;
        while (seguirProcesando){
            Menu.GeneraMenu();
            seguirProcesando = Menu.RealizaAccion(Menu.DeterminaOpcion());
        }
    }
}
