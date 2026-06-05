/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaPersonal {
    
    private final List<Lectura> coleccion = new ArrayList<>();
    
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
}
