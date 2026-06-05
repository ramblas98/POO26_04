/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_ej6;

/**
 *
 * @author alumno
 */
public class Comic extends Lectura {
    private String dibujante;
    private Color color;

    public Comic() {
    }

    public Comic(String dibujante, Color color) {
        this.dibujante = dibujante;
        this.color = color;
    }

    public Comic(String dibujante, Color color, String titulo, String autor, int numPaginas, double calificacion) {
        super(titulo, autor, numPaginas, calificacion);
        this.dibujante = dibujante;
        this.color = color;
    }

    public String getDibujante() {
        return dibujante;
    }

    public Color getColor() {
        return color;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String resumen(){
        
    }
    
    @Override
    public int tiempoEstimadoLectura(){
       return getNumPaginas()/100;
    }
}
