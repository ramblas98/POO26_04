package ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;

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
            if(f.esCompleja()){
                return true;
            }
        }
        return false;
    }

    public void agregarLocomotora(Locomotora l, int id) {
        Formacion f=this.listaFormaciones.get(id);
        if(!f.puedeMoverse()){

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

    public void locomotoraAFormacion(Locomotora l, int id) {
        Formacion f=this.listaFormaciones.get(id);
        if (!f.puedeMoverse()){
            int u =0;
            boolean b=false;
            while(u<this.listaLocotorasSueltas.size() && b==false){
                Locomotora ls=this.listaLocotorasSueltas.get(u);
                if(ls.arrastreUtil()>= f.kiloEmpujeFaltantes()){
                    b=true;
                    f.agregarLocomotora(ls);
                    this.eliminarLocomotoraSuelta(u);
                }
                else{
                    u++;
                }
            }
        }
    }

    public void mostrarListaFormacionesDetalles(){
        for(Formacion i : listaFormaciones){
            i.mostrarDetalles();
        }
    }

    public void completarFormaciones(){
        //Iterator<Formacion> f = listaFormaciones.iterator();
        Iterator<Locomotora> l = listaLocotorasSueltas.iterator();
        for(Formacion f : listaFormaciones){
            if(!f.puedeMoverse()){
                while(l.hasNext()){
                    if(!f.puedeMoverse()){
                        f.agregarLocomotora(l.next());
                    }else{
                        break;
                    }
                }
            }
        }
        /*
            boolean completa=false;
            if(!f.puedeMoverse()){
                while(!this.getListaLocotorasSueltas().isEmpty() && completa==false){
                    for(Locomotora l : this.getListaLocotorasSueltas()){
                        if(!f.puedeMoverse()){
                            f.agregarLocomotora(l);
                            completa=true;
                        }
                    }
                }
            }
            */

    }
}
