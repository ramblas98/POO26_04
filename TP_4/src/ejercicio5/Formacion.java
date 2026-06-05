package ejercicio5;

import java.util.ArrayList;

public class Formacion {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagon> vagones;
    private int id;

    public Formacion() {
        this.id = 282;
        this.locomotoras = new ArrayList<>();
        this.vagones = new ArrayList<>();
    }

    public Formacion(int id) {
        this.id = id;
        this.locomotoras = new ArrayList<>();
        this.vagones = new ArrayList<>();
    }

    public ArrayList<Locomotora> getLocomotoras() {
        return locomotoras;
    }

    public ArrayList<Vagon> getVagones() {
        return vagones;
    }

    public int getId() {
        return id;
    }

    public void setters() {
    }

    public int totalPasajeros() {
        int cantidad = 0;
        for(Vagon i : vagones){
            i.cantidadPasajeros();
        }
        return cantidad;
    }

    public int vagonesLivianos() {
        return 0;
    }

    public double velocidadMaxima() {

        return 0.0;
    }

    public boolean esEficiente() {
        for(Locomotora i : locomotoras){
            double peso = i.getPeso();
            if(peso * 5 <= i.getPesoMaximo() ){
                return false;
            }
        }
        return true;
    }

    public boolean puedeMoverse() {
        int cont1 = 0;
        for(Locomotora i : locomotoras){
            cont1 += i.getPesoMaximo();
        }
        if(cont1 >= vagones.size()){
            return true;
        }
        return false;
    }

    public double kiloEmpujeFaltantes() {
        return 0.0;
    }

    public boolean esCompleja() {
        return false;
    }
}
