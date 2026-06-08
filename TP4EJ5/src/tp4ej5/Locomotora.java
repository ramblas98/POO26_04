package tp4ej5;

public class Locomotora {
    private double peso;
    private double pesoMaximo; //que puede arrastrar
    private double velocidadMaxima;

    public Locomotora() {
    }

    public Locomotora(double peso, double pesoMaximo, double velocidadMaxima) {
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPeso() {
        return this.peso;
    }
    public double getPesoMaximo() {
        return this.pesoMaximo;
    }
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double arrastreUtil(){
        return this.getPesoMaximo()-this.peso;
    }
}
