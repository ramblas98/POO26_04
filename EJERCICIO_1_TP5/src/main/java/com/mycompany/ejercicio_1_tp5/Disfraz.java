/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_tp5;

/**
 *
 * @author USUARIO
 */
public class Disfraz implements Rentable{
    private String personaje;
    private char talle;
    private int dias;
    private double precio;

    public Disfraz() {
        this.dias=0;
    }

    public Disfraz(String personaje, char talle, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.dias=0;
        this.precio = precio;
    }

    public String getPersonaje() {
        return personaje;
    }

    public int getTalle() {
        return talle;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public void alquilar(int periodo){
        System.out.println("Disfraz de"+personaje+" sera alquilado por "+periodo+" dia/s");
        this.dias+=periodo;
    }
    
    @Override
    public boolean alquilado(){
        if(this.dias>0)return true;
        else return false;
    }
    
    @Override
    public void desocupar(){
        System.out.println("El disfraz de "+personaje+" desocupado");
        this.dias=0;
    }
}
