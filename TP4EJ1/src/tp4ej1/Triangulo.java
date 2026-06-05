/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej1;
/**
 *
 * @author Jazmín
 */
public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;
    public Triangulo(){}
    public Triangulo(double ladoA, double ladoB, double ladoC){
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
    }
    public double getLadoA(){
        return this.ladoA;
    }
    public double getLadoB(){
        return this.ladoB;
    }
    public double getLadoC(){
        return this.ladoC;
    }
    public void setLadoA(double ladoA){
        this.ladoA=ladoA;
    }
    public void setLadoB(double ladoB){
        this.ladoB=ladoB;
    }
    public void setLadoC(double ladoC){
        this.ladoC=ladoC;
    }
    public double altura(){
       double a=this.perimetro()/(double)2;
        a=Math.sqrt(a*(a-ladoA)*(a-ladoB)*(a-ladoC));
        a=(2*a)/(double)ladoC;
        return a;
    }
    @Override
    public double area(){
        return (ladoC*this.altura())/(double)2;
    }
    @Override
    public double perimetro(){
        return ladoA+ladoB+ladoC; 
    }
    public TipoT tipoTriangulo(){
        if(ladoA==ladoB&&ladoA==ladoC){
            return TipoT.EQUILATERO;
        }
        if(ladoA==ladoB||ladoA==ladoC||ladoB==ladoC){
            return TipoT.ISOCELES;
        }
        return TipoT.ESCALENO;
    }
    public boolean esRectangulo(){
        if(ladoA>ladoB &&ladoA>ladoC){
            return (ladoA*ladoA)==((ladoB*ladoB)+(ladoC*ladoC));
        }
        if(ladoB>ladoA &&ladoB>ladoC){
            return (ladoB*ladoB)==((ladoA*ladoA)+(ladoC*ladoC));
        }
        return (ladoC*ladoC)==((ladoA*ladoA)+(ladoB*ladoB));
    }

}
