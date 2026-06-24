/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        System.out.println("  a) CREACION DE OBJETOS");
       
        Inmueble inmueble1 = new Inmueble("Av. San Martin 450", "Departamento", 85000.0, 10);
        System.out.println("Creado: " + inmueble1);
 
        Inmueble inmueble2 = new Inmueble();     // constructor vacío
        inmueble2.setDireccion("Belgrano 123");
        inmueble2.setTipo("Casa");
        inmueble2.setValor(120000.0);
        inmueble2.setAnios(25);
        System.out.println("Creado: " + inmueble2);
 
        Disfraz disfraz1 = new Disfraz("Batman", 'L', 3, 4500.0);
        System.out.println("Creado: " + disfraz1);
 
        Disfraz disfraz2 = new Disfraz();        // constructor vacío
        disfraz2.setPersonaje("Elsa");
        disfraz2.setTalle('M');
        disfraz2.setDias(2);
        disfraz2.setPrecio(3800.0);
        System.out.println("Creado: " + disfraz2);
 
        
        System.out.println("\n  b) ALQUILAR (uno de cada clase)");
 
        inmueble1.alquilar(6);    // alquiler por 6 meses
        disfraz1.alquilar(3);     // alquiler por 3 días
        
        System.out.println("\n  c) LISTA ArrayList<Rentable>");
    
        List<Rentable> lista = new ArrayList<>();
        lista.add(inmueble1);
        lista.add(inmueble2);
        lista.add(disfraz1);
        lista.add(disfraz2);
        System.out.println("Lista creada con " + lista.size() + " objetos rentables.");
 
       
        System.out.println("\n  d) VERIFICAR Y DESOCUPAR");
 
        for (int i = 0; i < lista.size(); i++) {
            Rentable r = lista.get(i);
            System.out.println("\nObjeto #" + (i + 1) + ": " + r);
 
            if (r.alquilado()) {
                System.out.println("  -> Esta ALQUILADO. Procediendo a desocupar...");
                r.desocupar();
            } else {
                System.out.println("  -> Esta LIBRE. No se requiere desocupar.");
            }
        }
 
        // ── Estado final ───────────────────────────────────────────────────

        System.out.println("\n  ESTADO FINAL DE TODOS LOS OBJETOS");
 
        for (Rentable r : lista) {
            System.out.println(r);
        }
    }
    
}
