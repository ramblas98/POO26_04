/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ejercicio6;

/**
 *
 * @author Pc
 */
 public abstract class Lectura {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int calificacion;

 public Lectura(){}
 
 public Lectura(String titulo, String autor,int totalPaginas, int calificacion){
    this.titulo = titulo;
    this.autor = autor;
    this.totalPaginas = totalPaginas;
    this.calificacion = calificacion;
 }
 
 public String getTitulo(){
     return this.titulo;
 }
 
 public String getAutor(){
     return this.autor;
 }
 
 public int getTotalPaginas(){
     return this.totalPaginas;
 }
 
 public int getCalificacion(){
     return this.calificacion;
 }
 
 public void setTitulo(String titulo){
     this.titulo = titulo;
 }
 
 public void setAutor(String autor){
     this.autor = autor;
 }
 
 public void setTotalPaginas(int totalPaginas){
     this.totalPaginas = totalPaginas;
 }
 
 public void setCalificacion(int calificacion){
     this.calificacion = calificacion;
 }
 
 public abstract String resumen();
 public abstract int tiempoEstimadoLectura(); 
 }//Cierre de clase
