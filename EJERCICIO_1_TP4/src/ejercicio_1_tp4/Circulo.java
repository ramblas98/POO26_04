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
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    @Override
    public double perimetro(){
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio: " + radio + '}';
    }
    
    
}
