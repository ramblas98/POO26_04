/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ejercicio6;

/**
 *
 * @author Pc
 */
public class Revista extends Lectura{
    private int numEdicion;
    private Tematica tematica;
    
    public Revista(){
    }
    
    public Revista(int numEdicion, Tematica tematica){
        this.numEdicion = numEdicion;
        this.tematica = tematica;
    }
    
    public Revista(String titulo, String autor,int totalPaginas,int calificacion, int numEdicion){
        super(titulo,autor,totalPaginas,calificacion);
        this.numEdicion= numEdicion;
    }
    
    public int getNumEdicion(){
        return this.numEdicion;
    }
    
    public Tematica getTematica(){
        return this.tematica;
    }
    
    public void setNumEdicion(int nuevoNumEdicion){
        this.numEdicion = nuevoNumEdicion;
    }
    
    public void setTematica(Tematica nuevaTematica){
        this.tematica = nuevaTematica;
    }
    
    @Override
    public String resumen(){
        return "Titulo: "+ this.getTitulo() +
                "Autor: " + this.getAutor() +
                "Numero de Paginas: " + this.getTotalPaginas() +
                "Calificacion: " + this.getCalificacion() +
                "Numero de Edicion: " + this.numEdicion +
                "Tematica: " + this.tematica;
    }
    
    
    @Override
    public int tiempoEstimadoLectura(){
        return this.getTotalPaginas() / 70;
    }

}//Cierre de clase
