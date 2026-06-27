/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2_tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO_2_TP5 {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Gomez", "Juan",
                new GregorianCalendar(1985, 4, 12), 30111222, 2010));

        empleados.add(new Empleado("Perez", "Ana",
                new GregorianCalendar(1992, 8, 5), 35666777, 2018));

        empleados.add(new Empleado("Lopez", "Carlos",
                new GregorianCalendar(1978, 1, 20), 25444333, 2005));

        empleados.add(new Empleado("Martinez", "Lucia",
                new GregorianCalendar(1998, 10, 15), 40123456, 2022));

        empleados.add(new Empleado("Fernandez", "Mario",
                new GregorianCalendar(1989, 6, 30), 33222111, 2014));

        empleados.add(new Empleado("Rodriguez", "Sofia",
                new GregorianCalendar(1995, 2, 18), 37888999, 2019));

        empleados.add(new Empleado("Diaz", "Pedro",
                new GregorianCalendar(1982, 11, 8), 28999111, 2008));

        empleados.add(new Empleado("Torres", "Valeria",
                new GregorianCalendar(1990, 0, 25), 34555666, 2016));

        empleados.add(new Empleado("Alvarez", "Miguel",
                new GregorianCalendar(1987, 9, 10), 31999888, 2012));

        empleados.add(new Empleado("Romero", "Laura",
                new GregorianCalendar(1999, 3, 3), 41222333, 2023));

        // ==========================
        // Orden alfabético (Comparable)
        // ==========================
        Collections.sort(empleados);

        System.out.println("=== ORDEN ALFABETICO ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // ==========================
        // Orden por antigüedad
        // ==========================
        Collections.sort(empleados, new ComparaAntiguedad());

        System.out.println("\n=== ORDEN POR ANTIGUEDAD ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        // ==========================
        // Orden por edad
        // ==========================
        Collections.sort(empleados, new ComparaEdad());

        System.out.println("\n=== ORDEN POR EDAD ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}
