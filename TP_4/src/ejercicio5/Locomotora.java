package ejercicio5;

public class Locomotora {
    private double peso;
    private double pesoMaximo;
    private double velocidadMaxima;

    public Locomotora() {
        this.peso = 10;
        this.pesoMaximo = 60;
        this.velocidadMaxima = 30;
    }

    public Locomotora(double peso, double pesoMaximo, double velocidadMaxima) {
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
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
}
