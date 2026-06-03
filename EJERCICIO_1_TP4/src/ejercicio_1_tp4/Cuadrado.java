/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_tp4;

/**
 *
 * @author Administrador
 */
public class Cuadrado extends Cuadrilatero{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double area(){
        return lado*2;
    }
    
    @Override
    public boolean mismaArea(){
        return false;
    }
    
    @Override
    public double perimetro(){
        return lado*4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado igual: " + lado + '}';
    }
    
    
}
