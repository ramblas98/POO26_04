/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1_tp5;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO_1_TP5 {

    public static void main(String[] args) {
        ArrayList<Rentable> c = new ArrayList<Rentable>();
        
        Inmueble i1 = new Inmueble("Pasaje San Martin","vivienda",20000);
        Inmueble i2 = new Inmueble("Avenida Sarmiento","monoambiente",9600);
        Inmueble i3 = new Inmueble("Calle San Jose, block 2, piso 5","departamento",30000);
        
        Disfraz d1 = new Disfraz("Batman",'M',50000);
        Disfraz d2 = new Disfraz("Spiderman",'L',45000);
        
        c.add(i1);
        c.add(i2);
        c.add(i3);
        c.add(d1);
        c.add(d2);
        
        System.out.println("=== ALQUILANDO INMUEBLE MONOAMBIENTE ===");
        i2.alquilar(5);
        System.out.println("=== ALQUILANDO DISFRAZ BATMAN===");
        d1.alquilar(1);
        
        System.out.println("=== VERIFICANDO INMUEBLE Y DISFRAZ ===");
        for(Rentable a: c){
            boolean b;
            if(a instanceof Inmueble){
                Inmueble i = (Inmueble) a;
                b = i.alquilado();
                if(b){
                    System.out.println("El inmueble "+i.getTipo()+" direccion: "+i.getDireccion()+
                                        " esta siendo ALQUILADO");
                } else {
                    System.out.println("El inmueble "+i.getTipo()+" direccion: "+i.getDireccion()+
                                        " esta DESOCUPADO");
                }
            } else {
                Disfraz i = (Disfraz) a;
                b = i.alquilado();
                if(b){
                    System.out.println("El disfraz de "+i.getPersonaje()+" esta siendo ALQUILADO");
                } else {
                    System.out.println("El disfraz de "+i.getPersonaje()+" esta DESOCUPADO");
                }
            }
        }
    }
}
