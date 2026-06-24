/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_10;

public class Inmueble implements Rentable {
 
    private String direccion;
    private String tipo;
    private double valor;
    private int    anios;
 
    // Constructores 
 
    public Inmueble() {
    }
    
    public Inmueble(String direccion, String tipo, double valor, int anios) {
        this.direccion = direccion;
        this.tipo      = tipo;
        this.valor     = valor;
        this.anios     = anios;
    }
 
    // Getters y Setters
 
    public String getDireccion()              { return direccion; }
    public void   setDireccion(String d)      { this.direccion = d; }
 
    public String getTipo()                   { return tipo; }
    public void   setTipo(String t)           { this.tipo = t; }
 
    public double getValor()                  { return valor; }
    public void   setValor(double v)          { this.valor = v; }
 
    public int    getAnios()                  { return anios; }
    public void   setAnios(int a)             { this.anios = a; }
 
    @Override
    public void alquilar(int periodo) {
        this.anios = periodo;
    }

    //Indica si el inmueble está actualmente alquilado.
    @Override
    public boolean alquilado() {
        return this.anios > 0;
    }
 
    //Desocupa el inmueble: lo deja disponible para un nuevo inquilino.
    @Override
    public void desocupar() {
        this.anios = 0;
    }
 
    // toString
    @Override
    public String toString() {
        return "Inmueble { " + tipo + " | " + direccion
             + " | $" + valor + "/anio | " + anios + " anios"
             + " | Estado: " + (alquilado() ? "ALQUILADO (" + this.anios + " anio/s)" : "LIBRE") + " }";
    }
}
