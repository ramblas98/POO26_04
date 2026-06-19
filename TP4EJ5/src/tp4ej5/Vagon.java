package tp4ej5;


public abstract class  Vagon implements Comparable{
    private double largo;
    private double ancho;

    public Vagon() {
    }
    public Vagon(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public double getLargo(){
        return this.largo;
    }
    public double getAncho(){
        return this.ancho;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int cantidadPasajeros() {
        return 0;
    }

    public abstract double pesoMaximo();
    public abstract boolean esLiviano();
    
    @Override
    public int compareTo(Object o) {
        Vagon v = (Vagon) o;
        return Double.compare(this.pesoMaximo(), v.pesoMaximo());
    }
}
