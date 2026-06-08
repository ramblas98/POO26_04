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
    public void agregar(Lectura lectura) {
    for (Lectura l : coleccion) {
        if (l.getTitulo().equalsIgnoreCase(lectura.getTitulo())) {
            System.out.println("Ya existe una lectura con el titulo: " + lectura.getTitulo());
            break;
        }
    }
    coleccion.add(lectura);
    System.out.println("Agregada: "+ lectura.getTitulo());
    }
    
    // 2. Elimanr
    public boolean eliminarPorTitulo(String titulo) {
        return coleccion.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
    }
    
    public int eliminarPorAutor(String autor) {
        int antes = coleccion.size();
        coleccion.removeIf(l -> l.getAutor().equalsIgnoreCase(autor));
        return antes - coleccion.size();
    }
    
    // 3. Mayor y menor calificación 
    public Lectura getMayorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura mejor = coleccion.get(0);
        for (Lectura l : coleccion)
            if (l.getCalificacion() > mejor.getCalificacion()) mejor = l;
        return mejor;
    }
    
    public Lectura getMenorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura peor = coleccion.get(0);
        for (Lectura l : coleccion)
            if (l.getCalificacion() < peor.getCalificacion()) peor = l;
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
        for (Lectura l : coleccion)
            total += l.tiempoEstimadoLectura();
        return total;
    }
}
