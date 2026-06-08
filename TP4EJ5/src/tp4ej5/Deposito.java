package tp4ej5;

import java.util.ArrayList;

public class Deposito {
    private final ArrayList<Formacion> listaFormaciones;
    private final ArrayList<Locomotora> listaLocomotorasSueltas;

    public Deposito() {
        this.listaFormaciones= new ArrayList<>();
        this.listaLocomotorasSueltas= new ArrayList<>();
    }

    public ArrayList<Formacion> getListaFormaciones() {
        return listaFormaciones;
    }
    public void agregarFormacion(Formacion f) {
        this.listaFormaciones.add(f);
    }
    public ArrayList<Locomotora> getListaLocomotorasSueltas() {
        return listaLocomotorasSueltas;
    }
    public void agregarLocomotoraSuelta(Locomotora l){
        this.listaLocomotorasSueltas.add(l);
    }
    public void eliminarLocomotoraSuelta(int i){
        this.listaLocomotorasSueltas.remove(this.listaLocomotorasSueltas.get(i));
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

    public void locomotoraAFormacion(Locomotora l, int id) {
        Formacion f=this.listaFormaciones.get(id);
        if (!f.puedeMoverse()){
            int u =0;
            boolean b=false;
            while(u<this.listaLocomotorasSueltas.size() && b==false){
                Locomotora ls=this.listaLocomotorasSueltas.get(u);
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
   
    
    public ArrayList<Vagon> cojunto() {
        ArrayList<Vagon> v=new ArrayList<>();
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            v.add(f.vagonMasPesado());
        }
        return v;
    }
    public void mostrarDetallesFormaciones(){
        int c=0;
        for(Formacion f : listaFormaciones){
            System.out.println("Formacion " + c);
            f.mostrarDetalles();
            System.out.println("Puede moverse?: ");
            if (f.puedeMoverse()){
                System.out.print("SI");  
            }
            else{
                System.out.print("NO");  
            }
            System.out.println();
            c++;
        }
    }
}
