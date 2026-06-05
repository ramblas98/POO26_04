/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ejercicio6;
import java.util.ArrayList;
/**
 *
 * @author Pc
 */
public class BibliotecaPersonal {
    private ArrayList<Lectura> coleccion;
    
    
    public void agregarLectura(Lectura nuevaLectura){
        for(Lectura l: coleccion){
            if(l.getTitulo().equalsIgnoreCase(nuevaLectura.getTitulo())){
               System.out.println("Ya existe esta Lectura");
                break;
            }
        }
        coleccion.add(nuevaLectura);
        System.out.println("Se agrego exitosamente");
    }
    
    public void eliminarObraPorTitulo(String titulo){
        
    }
    
    public void eliminarObraPorAutor(String autor){
        
    }
    
    public Lectura obtenerLecturaMayor(){
        
    }
    
    public Lectura obtenerLecturaMenor(){
        
    }
    
    public void mostrarResumen(){
        
    }
    
    public int tiempoTotalEstimado(){
        
    }
    
}//Cierre de clase
