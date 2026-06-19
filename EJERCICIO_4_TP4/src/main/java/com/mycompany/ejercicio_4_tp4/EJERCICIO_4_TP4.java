/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4_tp4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO_4_TP4 {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();

        Auto vehiculo1 = new AutoNaftero(98,1800,"NAF-111", 0.0);
        Auto vehiculo2 = new AutoDiesel("Common Rail",1900,"DIE-222", 0); 
        Auto vehiculo3 = new AutoGNC(60.0,800, "GNC-333",0.0 ); 
        
        autos.add(vehiculo1); 
        autos.add(vehiculo2);
        autos.add(vehiculo3);
        
        //2 - revision tecnica 
        System.out.println("Revisacion Tecnica + Recomendacion de uso");
        for(Auto A : autos){
            A.realizarMantenimiento();
            System.out.println(A.obtenerRecomendacionUso());
        }


        
        //3 - cargarle 25.000 a cada uno 
        for(Auto A : autos){
            A.cargar(25000.00);
        }
        System.out.println("==============================================");
        System.out.println("4 - Tramo 1: Orán -> General Ballivian (84 km)");
        // 4 - Tramo 1: Orán -> General Ballivian (84 km) 
        for(Auto A : autos){
            A.recorrer(84);
        }
        
        System.out.println("=========================================================");
        System.out.println("5 - Tramo 2: General Ballivian -> Salvador Mazza (104 km)");
        // 5 - Tramo 2: General Ballivian -> Salvador Mazza (104 km) 
        for(Auto A : autos){
            A.recorrer(104);
        }

        System.out.println("==============================================");
        System.out.println("6 - Recarga de Emergencia y Retorno (100 km)");
        // 6 - Recarga de Emergencia y Retorno (100 km)
        for(Auto A : autos){
            A.cargar(15000.00); 
        }
        
        System.out.println("==============================================");
        System.out.println("7 - mostrar el combustible que le quedo a cada vehiculo");
        // 7 - mostrar el combustible que le quedo a cada vehiculo 
        System.out.println("Combustible restante de los vehiculos: ");
        for(Auto A : autos){
            System.out.println(A.getPatente()+' '+" combustible: "+String.format("%.2f", A.getCombustible())+" Lts");
        }
        
        ArrayList<Auto> autos2 = new ArrayList<>();
        Auto vehiculo4 = new AutoNaftero(98, 1800, "NAF-111", 42.7);
        Auto vehiculo5 = new AutoDiesel("Common Rail", 1900, "DIE-222", 58.3);
        Auto vehiculo6 = new AutoGNC(60.0, 800, "GNC-333", 21.9);

        Auto vehiculo7 = new AutoNaftero(98, 1800, "ABC-112", 73.5);
        Auto vehiculo8 = new AutoDiesel("Common Rail", 1900, "ZAF-378", 34.8);
        Auto vehiculo9 = new AutoGNC(60.0, 800, "XAN-616", 15.2);
        autos2.add(vehiculo4);
        autos2.add(vehiculo5);
        autos2.add(vehiculo6);
        autos2.add(vehiculo7);
        autos2.add(vehiculo8);
        autos2.add(vehiculo9);
        
        System.out.println("=== ORDENACION POR PATENTE ===");
        Collections.sort(autos2);
        for(Auto a: autos2){
            System.out.println(a);
        }
        
        System.out.println("=== ORDENACION POR COMBUSTIBLE ===");
        Collections.sort(autos2,new ComparaAutoCombustible());
        for(Auto a: autos2){
            System.out.println(a);
        }
    }
}
