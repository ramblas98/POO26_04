/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1_tp5;

/**
 *
 * @author USUARIO
 */
public class Inmueble implements Rentable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anios; //anios

    public Inmueble() {
        this.anios = 0;
    }

    public Inmueble(String direccion, String tipo, double valor) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
        this.anios = 0;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getAnios() {
        return anios;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }
    
    @Override
    public void alquilar(int periodo){
        System.out.println("El inmueble de "+tipo+" con direccion en: "+direccion
                            +" sera alquilado por: "+periodo+" anios");
        this.anios+=periodo; //aumento los años de uso del inmueble
    }
    
    @Override
    public boolean alquilado(){
        if(this.anios>0)return true;
        else return false;
    }
    
    @Override
    public void desocupar(){
        System.out.println("El inmueble "+tipo+", direccion"+direccion+" esta desocupado");
        this.anios=0;
    }
}
