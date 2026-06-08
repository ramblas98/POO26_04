/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public abstract class Lectura{
    
    private String titulo;
    private String autor;
    private int    totalPaginas;
    private int calificacion; 
 
    // Constructor 
    public Lectura() {
    }
    
    public Lectura(String titulo, String autor, int totalPagina, int calificacion) {
        this.titulo       = titulo;
        this.autor        = autor;
        this.totalPaginas   = totalPagina;
        setCalificacion(calificacion);
    }
 
    // Getters y setters 
    public String getTitulo()             { return titulo; }
    public String getAutor()              { return autor; }
    public int getTotalPaginas()            { return totalPaginas; }
    public int getCalificacion()       { return calificacion; }
    
    public void setTitulo(String t)       { this.titulo = t; }
    public void setAutor(String a)        { this.autor = a; }
    public void setTotalPagina(int n)      { this.totalPaginas = n; }
    public void setCalificacion(int c) {
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