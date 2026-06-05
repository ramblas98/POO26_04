/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author Jazmín
 */
public class Figura{
    public Figura(){}
    
    /*public double area(){
        return 0;
    }
    public double perimetro(){
        return 0;
    }*/
    
    public abstract double area();
    public abstract double perimetro();
    //igual=
    public boolean mismaArea(Figura f){
        return this.area()==f.area();
    }
    
}
