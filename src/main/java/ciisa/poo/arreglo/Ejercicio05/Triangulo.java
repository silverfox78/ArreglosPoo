package ciisa.poo.arreglo.Ejercicio05;

public class Triangulo {
    private float lados[];

    public Triangulo(float lados[]){
        this.lados = lados;
    }

    public boolean EsEquilatero(){
        if (this.lados.length < 3 || this.lados.length > 3){
            return false;
        }

        if ((this.lados[0] == this.lados[1]) && (this.lados[1] == this.lados[2])){
            return true;
        }

        return  false;
    }
}
