package ejercicio5;

import java.util.ArrayList;

public class Formacion {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagon> vagones;
    private int id;

    public Formacion() {
    }

    public void getters() {
    }

    public void setters() {
    }

    public int totalPasajeros() {
        return 0;
    }

    public int vagonesLivianos() {
        return 0;
    }

    private boolean esLiviano(Vagon v) {
        return false;
    }

    public double velocidadMaxima() {
        return 0.0;
    }

    public double velocidadMaximaMin() {
        return 0.0;
    }

    public boolean esEficiente() {
        return false;
    }

    public boolean puedeMoverse() {
        return false;
    }

    public double kiloEmpujeFaltantes() {
        return 0.0;
    }

    public boolean esCompleja() {
        return false;
    }
}
