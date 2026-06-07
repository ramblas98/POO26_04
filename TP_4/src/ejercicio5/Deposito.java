package ejercicio5;

import java.util.ArrayList;

public class Deposito {
    private ArrayList<Formacion> listaFormaciones;
    private ArrayList<Locomotora> listaLocotorasSueltas;

    public Deposito() {
        this.listaFormaciones= new ArrayList<>();
        this.listaLocotorasSueltas= new ArrayList<>();
    }

    public ArrayList<Formacion> getListaFormacion() {
        return listaFormaciones;
    }

    public ArrayList<Locomotora> getListaLocotorasSueltas() {
        return listaLocotorasSueltas;
    }

    public boolean coductorExperimentado() {
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            if(f.esCompleja()==true){
                return true;
            }
        }
        return false;
    }

    public void agregarLocomotora(Locomotora l, int id) {
        Formacion f=this.listaFormaciones.get(id);
        if(f.puedeMoverse()==false){

            this.eliminarLocomotoraSuelta(id);
        }
    }

    public void agregarLocomotoraSuelta(Locomotora l){
        this.listaLocotorasSueltas.add(l);
    }
    public void eliminarLocomotoraSuelta(int i){
        this.listaLocotorasSueltas.remove(this.listaLocotorasSueltas.get(i));
    }

    public void agregarFormacion(Formacion f){
        this.listaFormaciones.add(f);
    }

    public ArrayList<Vagon> cojunto() {
        ArrayList<Vagon> v=new ArrayList<>();
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            v.add(f.vagonMasPesado());
        }
        return v;
    }
}
