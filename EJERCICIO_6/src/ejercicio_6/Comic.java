/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public class Comic extends Lectura{
    
    private String  dibujante;
    private boolean color;
 
    // Constructores
    public Comic() {
    }

    public Comic(String dibujante, boolean color) {
        this.dibujante = dibujante;
        this.color = color;
    }
    
    public Comic(String titulo, String autor, int numPaginas, double calificacion, String dibujante, boolean color) {
        super(titulo, autor, numPaginas, calificacion);
        this.dibujante = dibujante;
        this.color     = color;
    }
 
    // Getters y setters específicos
    public String  getDibujante()           { return dibujante; }
    public void    setDibujante(String d)   { this.dibujante = d; }
 
    public boolean getColor()          { return color; }
    public void  isColor(boolean c)    { this.color = c; }
 
    // Métodos abstractos implementados
    @Override
    public int tiempoEstimadoLectura() {
        return getNumPaginas() / 100;
    }
    
    @Override
    public String resumen() {
        return "Comic: "      + getTitulo()
             + " | Autor: "   + getAutor()
             + " | Páginas: " + getNumPaginas()
             + " | Calificación: " + getCalificacion()
             + " | Dibujante: "    + dibujante
             + " | Color: "        + (color ? "True" : "False");
    }
}
