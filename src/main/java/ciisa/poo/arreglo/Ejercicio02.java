package ciisa.poo.arreglo;

public class Ejercicio02 {
    private float temperatura;

    private boolean esCelcius;

    public Ejercicio02(float temperatura, boolean esCelcius){
        this.temperatura = temperatura;
        this.esCelcius = esCelcius;
    }

    public float ObtieneTemperaturaCelcius(){
        return this.esCelcius ? this.temperatura : this.ConvierteCelcius();
    }

    public float ObtenerTemperaturaFahrenheit(){
        return this.esCelcius ? this.ConvierteFahrenheit() : this.temperatura;
    }

    private float ConvierteCelcius(){
        return ((this.temperatura - 32) / 1.8f);
    }

    private float ConvierteFahrenheit(){
        return ((this.temperatura * 1.8f) + 32);
    }
}
