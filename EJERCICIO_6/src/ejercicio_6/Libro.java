/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public class Libro extends Lectura{
    private Genero genero;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int totalPaginas, int calificacion, Geneto genero, int anioPublicacion) {
        super(titulo, autor, totalPaginas, calificacion);
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }

    public Libro(String genero, int anioPublicacion) {
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    

    public String getGenero() {
        return genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public String resumen(){
        String clasico;
        if(anioPublicacion<2000){
            clasico= "SI";
        }
        else clasico= "NO";
        
        return "Libro: " + getTitulo() +
               "Autor: " + getAutor() +
               "Genero: " + genero +
               "Año: " + anioPublicacion +
               "Clasico: " + clasico +
               "Calificacion: " + getCalificacion(); 
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return getTotalPaginas()/50; 
    }
}