package ejercicio5;

public class VagonCarga extends Vagon{
    private double cargaMaxima;

    public VagonCarga() {
    }

    public VagonCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public VagonCarga(double largo, double ancho, double cargaMaxima) {
        super(largo, ancho);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima(){
        return this.cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double pesoMaximo() {
        return this.cargaMaxima+160;
    }
    //A
    @Override
    public boolean esLiviano() {
        return this.pesoMaximo() < 2500;
    }

}
