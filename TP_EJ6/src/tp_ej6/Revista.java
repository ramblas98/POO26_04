/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_ej6;

/**
 *
 * @author alumno
 */
public class Revista extends Lectura {
    private int numEdicion;
    private Tematica tematica;

    public Revista(int numEdicion, Tematica tematica) {
        this.numEdicion = numEdicion;
        this.tematica = tematica;
    }

     public Revista(String titulo, String autor,int totalPaginas,int calificacion, int numEdicion){
        super(titulo,autor,totalPaginas,calificacion);
        this.numEdicion= numEdicion;
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
        return getNumPaginas()/70;
    }
}
