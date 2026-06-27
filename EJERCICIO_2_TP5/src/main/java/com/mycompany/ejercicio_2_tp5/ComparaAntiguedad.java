/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_tp5;

import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
public class ComparaAntiguedad implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Empleado e1 = (Empleado) o1;
        Empleado e2 = (Empleado) o2;
        int r = e1.getAnioIngreso()-e2.getAnioIngreso();
        if(r>0) return 1;
        else if(r<0) return -1;
        else return 0;
    }
}
