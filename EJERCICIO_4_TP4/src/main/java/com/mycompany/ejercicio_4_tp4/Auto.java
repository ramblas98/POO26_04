/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_tp4;

import java.util.Objects;

/**
 *
 * @author USUARIO
 */
public abstract class Auto implements Comparable{
    private String patente;
    private double combustible;
    
    //Constructor sin parametro
    public Auto() {
    }
    
    //Constructor con parametro
    public Auto(String patente, double combustible) {
        this.patente = patente;
        this.combustible = combustible;
    }

    public abstract String obtenerRecomendacionUso();

    public abstract void realizarMantenimiento();
    
    //Getter
    public String getPatente() {
        return patente;
    }

    public double getCombustible() {
        return combustible;
    }
    
    //Setter
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        return Objects.equals(this.patente, other.patente);
    }

    abstract public void cargar(double monto);

    abstract public void recorrer(double monto);
    
    @Override
    public String toString() {
        return "Patente: "+patente+", combustible: "+combustible;
    }

    @Override
    public int compareTo(Object o){
        Auto a = (Auto) o;
        return this.patente.compareTo(a.getPatente());
    }
}
