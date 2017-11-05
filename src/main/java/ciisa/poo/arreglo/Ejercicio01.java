package ciisa.poo.arreglo;


public class Ejercicio01 {
    private String datosOriginales;

    public Ejercicio01(String datosOriginales){
        this.datosOriginales = datosOriginales;
    }

    public char[] RecuperaDatosValidos(){
        //Declaracion de variable temporal, en ella contendremos los valores validos
        String tmp = "";

        //Ciclo destinado a recorrer la cadena de datos originales
        for (int i = 0; i < this.datosOriginales.length(); i++){

            //Determina si el caracter especifico de la cadena original es un dato valido (Digito o Vocal)
            if(this.EsValido(this.datosOriginales.charAt(i))){
                System.out.println("Posicion: " + String.valueOf(i) + " - Valor: " + String.valueOf(this.datosOriginales.charAt(i)));
                //Asigna caracter valido a la cadena
                tmp = tmp + String.valueOf(this.datosOriginales.charAt(i));
                System.out.println(tmp);
            }
        }

        //Retorno arreglo de datos validos
        return tmp.toCharArray();
    }

    /*
        Estas funcion tiene el proposito de validar si el dato ingresado es un Digito, osea, pertenece al conjunto : 0, 1, 2, 3, 4, 5, 6, 7, 8 o 9
     */
    private boolean EsDigito(char valor){
        return (int) valor >= 48 && (int) valor <= 57;
    }

    /*
        Esta funcion valida que el dato ingresado sea una Vocal
     */
    private boolean EsVocal(char valor){
        return "AEIOU".contains(String.valueOf(valor).toUpperCase());
    }

    /*
        Estas funcion tiene el proposito de validar si el dato ingresado es un Digito, osea, pertenece al conjunto : 0, 1, 2, 3, 4, 5, 6, 7, 8 o 9
     */
    private boolean EsDigito(String valor){
        return "0123456789".contains(valor);
    }

    /*
        Esta funcion valida que el dato ingresado sea una Vocal
     */
    private boolean EsVocal(String valor){
        return "AEIOU".contains(valor.toUpperCase());
    }

    private boolean EsValido(char valor){
        return EsDigito(valor) || EsVocal(valor);
    }

    private boolean EsValido(String valor){
        return EsDigito(valor) || EsVocal(valor);
    }
}
