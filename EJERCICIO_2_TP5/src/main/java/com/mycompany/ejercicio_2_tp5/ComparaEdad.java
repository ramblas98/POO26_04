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
public class ComparaEdad implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Empleado e1 = (Empleado) o1;
        Empleado e2 = (Empleado) o2;
        return e1.getFechaNacimiento().compareTo(e2.getFechaNacimiento());
    }
}
