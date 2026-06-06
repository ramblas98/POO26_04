/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4_tp4;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO_4_TP4 {

    public static void main(String[] args) {
        Auto a1 = new AutoNaftero(95,1800,"ABC 123",10);
        Auto a2 = new AutoDiesel("Inyector-Bomba",1900,"WES 911",0);
        Auto a3 = new AutoGNC(120,800,"NAR 954",0);
        
        System.out.println("=============== AUTO NAFTERO ===============");
        System.out.println("=== CARGAR ===");
        a1.cargar(150000);
        System.out.println("=== RECORRER ===");
        a1.recorrer(22);
        System.out.println("=== RECOMENDACION DE USO ===");
        System.out.println(a1.obtenerRecomendacionUso());
        //Chequeo
        a1.realizarMantenimiento();
        
        System.out.println("=============== AUTO DIESEL ===============");
        System.out.println("=== CARGAR ===");
        a2.cargar(150000);
        System.out.println("=== RECORRER ===");
        a2.recorrer(22);
        System.out.println("=== RECOMENDACION DE USO ===");
        System.out.println(a2.obtenerRecomendacionUso());
        //Chequeo
        a2.realizarMantenimiento();
        
        System.out.println("=============== AUTO GNC ===============");
        System.out.println("=== CARGAR ===");
        a3.cargar(100000);
        System.out.println("=== RECORRER ===");
        a3.recorrer(22);
        System.out.println("=== RECOMENDACION DE USO ===");
        System.out.println(a3.obtenerRecomendacionUso());
        //Chequeo
        a3.realizarMantenimiento();
        
    }
}
