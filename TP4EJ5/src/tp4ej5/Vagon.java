package ejercicio5;

public abstract class  Vagon {
    private double largo;
    private double ancho;

    public Vagon() {
    }

    public Vagon(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void get() {
    }

    public void set() {
    }

    public int cantidadPasajeros() {
        return 0;
    }

    public abstract double pesoMaximo();

    public abstract boolean esLiviano();
}
