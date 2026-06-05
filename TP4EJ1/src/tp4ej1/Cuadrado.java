/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;

/**
 *
 * @author Jazmín
 */
public class Cuadrado extends Rectangulo{
    public Cuadrado(){}
    public Cuadrado(double lado) {
        super(lado, lado);
    }
    @Override
    public double getBase(){ 
        return super.getBase();
    }
    @Override
    public void setBase(double lado){
        super.setBase(lado);
        //super.setAltura(lado);
    }
}
