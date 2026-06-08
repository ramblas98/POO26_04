/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej5;

import ejercicio5.Formacion;
import ejercicio5.Locomotora;
import ejercicio5.VagonCarga;
import ejercicio5.VagonPasajero;

/**
 *
 * @author Jazmín
 */
public class TP4EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deposito d = new Deposito();
        
        Formacion f1=new Formacion(1);
        f1.setAgregarVagon(new VagonPasajero(10, 2)); 
        Locomotora l1= new Locomotora(1234.0, 4567.0, 7890.0);
        Locomotora l2= new Locomotora(1000.0, 40000.0, 70000.0);
        f1.setAgregarLocomotora(l1);
        f1.setAgregarLocomotora(l2);
        System.out.println(f1.puedeMoverse());
        
        
        
        Formacion f2=new Formacion(2);
        f2.agregarVagon(new VagonCarga(10, 3.5, 3000.0));
        d.agregarFormacion(f1);
        d.agregarFormacion(f2);
        
        
        //Locomotoras sueltas
        System.out.println("Locomotoras sueltas");
        Locomotora lSuelta1= new Locomotora(1111.0, 2222.0, 3333.0);
        d.agregarLocomotoraSuelta(lSuelta1);
        Locomotora lSuelta2= new Locomotora(4444.0, 5555.0, 6666.0);
        d.agregarLocomotoraSuelta(lSuelta2);
        Locomotora lSuelta3= new Locomotora(7777.0, 8888.0, 9999.0);
        d.agregarLocomotoraSuelta(lSuelta3);
        

        System.out.println("---ESTADO FORMACIONES---");
        for (int i = 0; i < d.getListaFormaciones().size(); i++) {
            Formacion f = d.getListaFormaciones().get(i);
            System.out.println("Formación " + i + "\n -Puede moverse?: ");
            if (f.puedeMoverse()){
                System.out.print("SI");  
            }
            else{
                System.out.print("NO");  
            }
        System.out.println("Locomotoras sueltas disponibles: " + d.getListaLocotorasSueltas().size());
        
        
        
        
    }






        d.locomotoraAFormacion(lSuelta1);
        d.locomotoraAFormacion(lSuelta2);
        d.locomotoraAFormacion(lSuelta3);
        
        
        
        
    
}
    