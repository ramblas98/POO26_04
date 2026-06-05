package ejercicio5;

public class VagonPasajero extends Vagon{
    private int cantP;

    public VagonPasajero() {
    }

    public VagonPasajero(int cantP) {
        this.cantP = cantP;
    }

    public VagonPasajero(double largo, double ancho, int cantP) {
        this.cantP = cantP;
    }

    public void getters() {
    }

    public void setters() {
    }

    @Override
    public double pesoMaximo() {
        return cantP*80;
    }

    @Override
    public boolean esLiviano() {
        return false;
    }

    @Override
    public int cantidadPasajeros() {
        return cantP;
    }
}
