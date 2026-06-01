/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author Jazmín
 */
public class Circulo extends Figura {
    private double radio;
    public Circulo(){}
    public Circulo(double radio){
        this.radio=radio; 
   }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    @Override
    public double area(){
        return radio*Math.PI;
    }
}
