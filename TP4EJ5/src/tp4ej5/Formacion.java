package ejercicio5;

import java.util.ArrayList;

public class Formacion {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagon> vagones;
    private int id;

    public Formacion() {
    }
    public Formacion(int id) {
        this.id=id;
    }

    public ArrayList<Locomotora> getLocomororas() {
        return locomotoras;
    }
    public ArrayList<Vagon> getVagones() {
        return vagones;
    }
    public void setAgregarLocomotora(Locomotora l) {
        locomotoras.add(l);
    }
    public void setAgregarVagon(Vagon v) {
        vagones.add(v);
    }

    public int totalPasajeros() {
        int t=0;
        for(Vagon v : vagones){
            t=t+v.cantidadPasajeros();
        }
        return t;
    }

    public int vagonesLivianos() {
        int c=0;
        for(Vagon v : vagones){
            if(v.esLiviano()==true){
                c++;
            }
        }
        return c;
    }

    public double velocidadMaximaMin(){
        if (locomotoras.isEmpty()){
            return 0;
        }
        double m=locomotoras.getFirst().getVelocidadMaxima();
        for(int i=1; i<locomotoras.size(); i++){
            double aux = locomotoras.get(i).getVelocidadMaxima();
            if(aux<m)m=aux;
        }
        return m;
    }

    public boolean esEficiente() {
        for(Locomotora l : locomotoras){
            if(l.arrastreUtil()<l.getPeso()*5){
                return false;
            }
        }
        return true;
    }

    private double totalArrastreLocomotoras(){
        double a=0;
        for(Locomotora l : locomotoras){
            a=a+l.arrastreUtil();
        }
        return a;
    }
    private double totalPesoMaximoVagones(){
        double x=0;
        for(Vagon v : vagones){
            x=x+v.pesoMaximo();
        }
        return x;
    }
    private double totalPesoMaximoLocomotoras(){
        double x=0;
        for(Locomotora l : locomotoras){
            x=x+l.getPeso();
        }
        return x;
    }
    
    public boolean puedeMoverse() {
        return this.totalArrastreLocomotoras()>=
                this.totalPesoMaximoVagones();
    }
    
    public double kiloEmpujeFaltantes() {
        if(this.puedeMoverse()) return 0;
        return this.totalPesoMaximoVagones()-
                this.totalArrastreLocomotoras();
    }

    public boolean esCompleja() {
        if(this.locomotoras.size()+this.vagones.size()>20){
            return true;
        }
        return (this.totalPesoMaximoLocomotoras()+
                this.totalPesoMaximoVagones()>10000);
    }
    
    public Vagon vagonMasPesado(){
        if (vagones.isEmpty()) return null;
        Vagon p=vagones.get(0);
        for(Vagon v : vagones){
            if(v.pesoMaximo()>p.pesoMaximo()){
                p=v;
            }
        }
        return p;
    }

    public void agregarVagon(VagonPasajero vagonPasajero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
