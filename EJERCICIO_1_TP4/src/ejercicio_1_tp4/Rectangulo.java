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
public class Rectangulo extends Cuadrilatero{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
        return base*altura;
    }
    
    @Override
    public boolean mismaArea(){
        return false;
    }
    
    @Override
    public double perimetro(){
        return 2*base + 2*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base: " + base + ", altura: " + altura + '}';
    }
    
    
}
