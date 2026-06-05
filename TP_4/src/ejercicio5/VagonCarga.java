package ejercicio5;

public class VagonCarga extends Vagon{
    private double cargaMaxima;

    public VagonCarga() {
    }

    public VagonCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public VagonCarga(double largo, double ancho, double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void getters() {
    }

    public void setters() {
    }

    @Override
    public double pesoMaximo() {
        return cargaMaxima+160;
    }

    @Override
    public boolean esLiviano() {
        if(){

        }
    }
}
