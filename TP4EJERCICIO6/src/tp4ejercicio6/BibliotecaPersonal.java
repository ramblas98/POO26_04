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
    private ArrayList<Lectura> coleccion = new ArrayList<>();
    
    public BibliotecaPersonal(){}
    
    public void agregarLectura(Lectura nuevaLectura){
        //if(coleccion.isEmpty()) coleccion.add(nuevaLectura);
        boolean agregado = true;
        for(Lectura l: coleccion){
            if(l.getTitulo().equalsIgnoreCase(nuevaLectura.getTitulo())){
               
               agregado = false;
            }
        }
        if(agregado == true){
           coleccion.add(nuevaLectura);
           System.out.println("Se agrego exitosamente");
        } else System.out.println("Ya existe esta Lectura");
        
    }
    
    public void eliminarObraPorTitulo(String titulo){
        boolean encont = false;
        for(Lectura l: coleccion){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                encont = coleccion.remove(l);
                System.out.println("\nLectura " +titulo + " elimminada");
                break;
            }
        }
        if(encont == false) System.out.println("\nEl titulo " + titulo + " no existe");
    }
    
    //OPERADOR TERNARIO
    //variable = (condición) ? valor_si_es_verdadero : valor_si_es_falso;
    
    /*
    // Compara el atributo 'getNombre()' con el 'nombreABuscar'
        lista.removeIf(producto -> producto.getNombre().equals(nombreABuscar));
    */
    
    public void eliminarObraPorAutor(String autor){
        ArrayList<Lectura> eliminados = new ArrayList<>();
        
        for(Lectura l: coleccion){
            if(l.getAutor().equalsIgnoreCase(autor)){
                eliminados.add(l);
            }
        }   
        coleccion.removeAll(eliminados);
        System.out.println("\nCantidad de Obras eliminadas del autor " +autor+": " + eliminados.size());
    }
    //System.out.println("Lectura con el autor"+ autor + " elimminada");
    //if(encont == false) System.out.println("El autor " + autor + "no existe");
    public Lectura obtenerLecturaMayor(){
        if(coleccion.isEmpty()){
            System.out.println("La lista esta vacia");
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
            System.out.println("La lista esta vacia");
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
       if(coleccion.isEmpty()) System.out.println("La lista esta vacia");
       for(Lectura l: coleccion){
           System.out.println("~~~~~~~~~~~~~~~~");
           System.out.println(l.resumen());
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
