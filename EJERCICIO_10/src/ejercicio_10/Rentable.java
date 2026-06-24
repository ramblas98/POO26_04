/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10;

/**
 *
 * @author Hp
 */
public interface Rentable {
    
    //Marca el objeto como alquilado durante un período dado.
    //@param periodo cantidad de días (Disfraz) o meses (Inmueble) del alquiler
    void alquilar(int periodo);
 
    
    //Consulta si el objeto está actualmente alquilado.
    //@return true si está alquilado, false si está libre
    boolean alquilado();
 
    //Libera el objeto: lo deja disponible para un nuevo alquiler.
    void desocupar();
}
