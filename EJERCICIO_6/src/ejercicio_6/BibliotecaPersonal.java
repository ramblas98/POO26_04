/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaPersonal {
    
    private final List<Lectura> coleccion = new ArrayList<>();

    public BibliotecaPersonal() {
    }
    
    // 1. Agregar
    public void agregarLectura(Lectura lectura) {
    for (Lectura l : coleccion) {
        if (l.getTitulo().equalsIgnoreCase(lectura.getTitulo())) {
            System.out.println("Ya existe una lectura con el titulo: " + lectura.getTitulo());
            return;
        }
    }
    coleccion.add(lectura);
    System.out.println("Agregada: "+ lectura.getTitulo());
    }
    
    // 2. Elimanr
    public void eliminarPorTitulo(String titulo) {
        boolean eliminado = coleccion.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
        if (eliminado) {
            System.out.println("Eliminada: " + titulo );
        } else {
            System.out.println("No se encontró ninguna obra con el título: " + titulo );
        }
    }
    
    public int eliminarPorAutor(String autor) {
        int antes = coleccion.size();
        coleccion.removeIf(l -> l.getAutor().equalsIgnoreCase(autor));
        int eliminados = antes - coleccion.size();
        if (eliminados > 0) {
            System.out.println("Eliminadas " + eliminados + " obra(s) del autor: " + autor );
        } else {
            System.out.println("No se encontró ninguna obra del autor: " + autor );
        }
        return eliminados;
    }
    
    // 3. Mayor y menor calificación 
    public Lectura getMayorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura mejor = coleccion.get(0);
        for (Lectura l : coleccion){
            if (l.getCalificacion() > mejor.getCalificacion()) mejor = l;
        }
        return mejor;
    }
    
    public Lectura getMenorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura peor = coleccion.get(0);
        for (Lectura l : coleccion){
            if (l.getCalificacion() < peor.getCalificacion()) peor = l;
        }
        return peor;
    }
    
    // 4. Resumen general
    public void mostrarResumenGeneral() {
        if (coleccion.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println(" BIBLIOTECA PERSONAL ");
        for (int i = 0; i < coleccion.size(); i++) {
            System.out.printf("%2d. %s%n", i + 1, coleccion.get(i).resumen());
        }
    }
    
    //5. Tiempo total estimado 
    public int tiempoTotalEstimado() {
        int total = 0;
        for (Lectura l : coleccion){
            total += l.tiempoEstimadoLectura();
        }
        return total;
    }
}
