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

    public Revista(int numEdicion, Tematica tematica, String titulo, String autor, int numPaginas, double calificacion) {
        super(titulo, autor, numPaginas, calificacion);
        this.numEdicion = numEdicion;
        this.tematica = tematica;
    }

    @Override
    public String resumen(){
        return "Temartica: " + tematica +
                "Numero de edicion: " + numEdicion +
                "Titulo: " + getTitulo() +
                "Calificacion: " + getCalificacion() +
                
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return getNumPaginas()/70;
    }
}
