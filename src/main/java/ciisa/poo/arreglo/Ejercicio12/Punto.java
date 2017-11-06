package ciisa.poo.arreglo.Ejercicio12;

public class Punto {
    private float coordinadaX;
    private float coordinadaY;

    public Punto(float coordinadaX, float coordinadaY) {
        this.coordinadaX = coordinadaX;
        this.coordinadaY = coordinadaY;
    }

    public float getCoordinadaY() {
        return coordinadaY;
    }

    public void setCoordinadaY(float coordinadaY) {
        this.coordinadaY = coordinadaY;
    }

    public float getCoordinadaX() {
        return coordinadaX;
    }

    public void setCoordinadaX(float coordinadaX) {
        this.coordinadaX = coordinadaX;
    }

    public Punto Sumar(Punto punto) {
        return new Punto(this.coordinadaX + punto.getCoordinadaX(), this.coordinadaY + punto.getCoordinadaY());
    }

    public Punto Restar(Punto punto) {
        return new Punto(this.coordinadaX - punto.getCoordinadaX(), this.coordinadaY - punto.getCoordinadaY());
    }

    public Punto Multiplicar(Punto punto) {
        return new Punto(this.coordinadaX * punto.getCoordinadaX(), this.coordinadaY * punto.getCoordinadaY());
    }

    public Punto Dividir(Punto punto) {
        return new Punto(this.coordinadaX / punto.getCoordinadaX(), this.coordinadaY / punto.getCoordinadaY());
    }
}
