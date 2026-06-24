/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4ej20;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Jazmín
 */
public class TP4EJ20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nombreApellido, int dia, int mes, int anio,
            int dni, int anioIngreso)*/
        ArrayList<Empleado> lista=new ArrayList<>();
        lista.add(new Empleado("Juan Sanchez", 5, 9, 2003, 44123456, 2024));
        lista.add(new Empleado("Rocio Choque", 16, 7, 2003, 44234567, 2020));
        lista.add(new Empleado("Guadalupe Romero", 22, 8, 2004, 44345678, 2015));
        lista.add(new Empleado("Javier Ruso", 26, 2, 2004, 45111222, 2026));
        lista.add(new Empleado("Daniel Medina", 15, 2, 2000, 40112334, 2012));
        lista.add(new Empleado("Nayla Donat", 10, 9, 2003, 44555666, 2021));
        
        for(int i=0; i<lista.size(); i++){
            lista.get(i).detalles();
        }
        System.out.println("\nORDEN NATURAL (alfabeticamente)---------");
        Collections.sort(lista);
        for(int i=0; i<lista.size(); i++){
            lista.get(i).detalles();
        }
        System.out.println("\nORDEN POR ANTIGUEDAD---------");
        Collections.sort(lista, new OrdenarPorAntiguedad());
        for(int i=0; i<lista.size(); i++){
            lista.get(i).detalles();
        }
        
        System.out.println("\nORDEN POR EDAD------------");
        Collections.sort(lista, new OrdenarPorEdad());
        for(int i=0; i<lista.size(); i++){
            lista.get(i).detalles();
        }
        
        /*
    public void ordenarPorPasajeros() {
        Collections.sort(this.listaFormaciones, new CompararPorPasajeros());
        System.out.println("\nFORMACIONES POR PASAJEROS");
        this.mostrarDetallesFormaciones();
    }*/
    }
    
}
