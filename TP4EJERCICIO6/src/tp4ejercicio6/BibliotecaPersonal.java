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
        boolean encont = false;
        for(Lectura l: coleccion){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                encont = coleccion.remove(l);
                System.out.println("Lectura elimminada");
                break;
//System.out.println(coleccion.remove(l) ? "Lectura eliminada" : "No existe esta Lectura");
            }
        }
        if(encont == false) System.out.println("El titulo " + titulo + "no existe");
    }
    
    //OPERADOR TERNARIO
    //variable = (condición) ? valor_si_es_verdadero : valor_si_es_falso;
    
    /*
    // Compara el atributo 'getNombre()' con el 'nombreABuscar'
        lista.removeIf(producto -> producto.getNombre().equals(nombreABuscar));
    */
    
    public void eliminarObraPorAutor(String autor){
        boolean encont = false;
        for(Lectura l: coleccion){
            if(l.getAutor().equalsIgnoreCase(autor)){
                encont = coleccion.remove(l);
                System.out.println("Lectura elimminada");
                break;
//System.out.println(coleccion.remove(l) ? "Lectura eliminada" : "No existe esta Lectura");
            }
        }
        if(encont == false) System.out.println("El autor " + autor + "no existe");
    }
    
    public Lectura obtenerLecturaMayor(){
        if(coleccion.isEmpty()){
            //System.out.println("La lista esta vacia");
            return null;
        }
        Lectura mayor = coleccion.get(0);
        for(Lectura l: coleccion){
            //mayor = (l.getCalificacion() > mayor.getCalificacion()) ? l : mayor;
            if(l.getCalificacion() > mayor.getCalificacion()){
                mayor = l;
            }
        }
        return mayor;
    }
    
    public Lectura obtenerLecturaMenor(){
        if(coleccion.isEmpty()){
            //System.out.println("La lista esta vacia");
            return null;
        }
        Lectura menor = coleccion.get(0);
        for(Lectura l: coleccion){
            if(l.getCalificacion() < menor.getCalificacion()){
                menor = l;
            }
        }
        return menor;
    }
    
    public void mostrarResumen(){
       for(Lectura l: coleccion){
           System.out.println("~~~~~~~~~~~~~~~~");
           l.resumen();
           System.out.println("~~~~~~~~~~~~~~~~");
       }
    }
    
    public int tiempoTotalEstimado(){
        int suma=0;
        for(Lectura l: coleccion){
            suma += l.tiempoEstimadoLectura();
        }
        return suma;
    }
    
}//Cierre de clase
