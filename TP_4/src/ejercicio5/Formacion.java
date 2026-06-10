package ejercicio5;

import java.util.ArrayList;

public class Formacion {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagon> vagones;

    public Formacion() {
        this.locomotoras = new ArrayList<>();
        this.vagones = new ArrayList<>();
    }

    public ArrayList<Locomotora> getLocomotoras() {
        return locomotoras;
    }

    public ArrayList<Vagon> getVagones() {
        return vagones;
    }

    public void agregarLocomotora(Locomotora l){
        this.locomotoras.add(l);
    }

    public void agregarVagon(Vagon v){
        this.vagones.add(v);
    }

    public int totalPasajeros() {
        int cantidad = 0;
        for(Vagon i : vagones){
            cantidad += i.cantidadPasajeros();
        }
        return cantidad;
    }

    public int vagonesLivianos() {
        int c = 0;
        for(Vagon i : vagones){
            if(i.esLiviano()){
                c++;
            }
        }
        return c;
    }

    public double velocidadMaxima() {
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
        for(Locomotora i : locomotoras){
            if(i.arrastreUtil() < i.getPeso()*5){
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
        return this.totalArrastreLocomotoras() >= this.totalPesoMaximoVagones();
    }

    public double kiloEmpujeFaltantes() {
        if(puedeMoverse()){
            return 0.0;
        }
        return this.totalPesoMaximoVagones() - this.totalArrastreLocomotoras();
    }

    public boolean esCompleja() {
        if(this.locomotoras.size() + this.vagones.size() > 20 || this.totalPesoMaximoLocomotoras() + this.totalPesoMaximoVagones() > 10000){
            return true;
        }
        return false;
    }

    public Vagon vagonMasPesado(){
        Vagon MvagonPesado = null;
        for(Vagon i : vagones){
            if(MvagonPesado == null){
                MvagonPesado = i;
            }
            if(MvagonPesado.pesoMaximo() < i.pesoMaximo()){
                MvagonPesado = i;
            }
        }
        return MvagonPesado;
    }

    public void mostrarDetalles(){
        System.out.println("Cantidad de locomotoras: " + locomotoras.size());
        System.out.println("Cantidad de vagones: " + vagones.size());
        System.out.println("Puede moverse?: ");
        if (this.puedeMoverse()){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        System.out.println("Vagones Livianos: " + this.vagonesLivianos());
        System.out.println("Valocidad Maxima: " + this.velocidadMaxima());
        System.out.println("Locomotoras Eficientes?: " + this.esEficiente());
        System.out.println(" ");
    }
}
