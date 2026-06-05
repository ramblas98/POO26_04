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

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public double pesoMaximo() {
        return cargaMaxima+160;
    }

    @Override
    public boolean esLiviano() {
        if(cargaMaxima < 2500.0){
            return true;
        }
        return false;
    }
}
