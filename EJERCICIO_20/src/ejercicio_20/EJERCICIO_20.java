/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_20;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class EJERCICIO_20 {

    public static void main(String[] args) {
        
        ArrayList<Empleado> l = new ArrayList<>();
        l.add(new Empleado("Gomez",    "Carlos",  LocalDate.of(1990, 3, 15), "30111222", 2015));
        l.add(new Empleado("Arias",    "Maria",   LocalDate.of(1985, 7, 22), "28333444", 2008));
        l.add(new Empleado("Perez",    "Luis",    LocalDate.of(1978, 1, 10), "22555666", 2001));
        l.add(new Empleado("Benitez",  "Ana",     LocalDate.of(1995, 11, 5), "33777888", 2020));
        l.add(new Empleado("Salinas",  "Jorge",   LocalDate.of(1982, 6, 30), "25999000", 2010));

        // 1) Orden natural → alfabético (Comparable)
        Collections.sort(l);
        System.out.println("=== ORDEN ALFABETICO ===");
        for (Empleado e : l) {
            System.out.println(e);
        }

        // 2) Por antigüedad (Comparator)
        ArrayList<Empleado> l_ant = new ArrayList<>(l);
        Collections.sort(l_ant, new CompareEmpAnt());
        System.out.println("\n=== POR ANTIGUEDAD ===");
        for (Empleado e : l_ant) {
            System.out.println(e);
        }

        // 3) Por edad (Comparator)
        ArrayList<Empleado> l_edad = new ArrayList<>(l);
        Collections.sort(l_edad, new CompareEmpEdad());
        System.out.println("\n=== POR EDAD (mayor a menor) ===");
        for (Empleado e : l_edad) {
            System.out.println(e);
        }
    }
}
