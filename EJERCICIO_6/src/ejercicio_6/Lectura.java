/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public abstract class Lectura {
    
    private String titulo;
    private String autor;
    private int    numPaginas;
    private double calificacion; 
 
    // Constructor 

    public Lectura() {
    }
    
    public Lectura(String titulo, String autor, int numPaginas, double calificacion) {
        this.titulo       = titulo;
        this.autor        = autor;
        this.numPaginas   = numPaginas;
        setCalificacion(calificacion);
    }
 
    // Getters y setters 
    public String getTitulo()             { return titulo; }
    public String getAutor()              { return autor; }
    public int getNumPaginas()            { return numPaginas; }
    public double getCalificacion()       { return calificacion; }
    
    public void setTitulo(String t)       { this.titulo = t; }
    public void setAutor(String a)        { this.autor = a; }
    public void setNumPaginas(int n)      { this.numPaginas = n; }
    public void setCalificacion(double c) {
        if (c < 0)  c = 0;
        if (c > 10) c = 10;
        this.calificacion = c;
    }
 
    // Métodos abstractos
    public abstract String resumen();
 
    public abstract int tiempoEstimadoLectura();
 
    @Override
    public String toString() {
        return resumen();
    }
}