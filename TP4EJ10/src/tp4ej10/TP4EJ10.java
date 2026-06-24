/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej10;

import java.util.ArrayList;

/**
 *
 * @author Jazmín
 */
public class TP4EJ10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inmueble i1=new Inmueble("Alvarado 123", "Residencial", 12345);
        Inmueble i2=new Inmueble("Fasio 456", "Comercial", 67890);
        Disfraz d1=new Disfraz ("Mono", 's', 4321.5);
        Disfraz d2=new Disfraz ("Gato", 'm', 5678.5);
        
        i1.alquilar(3);
        d1.alquilar(14);
        
        ArrayList<Rentable> lista = new ArrayList<>();
        lista.add(i1);
        lista.add(i2);
        lista.add(d1);
        lista.add(d2);
        
        for (int i=0; i<lista.size(); i++){
            Rentable rt=lista.get(i);
            if(rt.alquilado()==true){
                rt.desocupar();
            }
        }
    }
}
