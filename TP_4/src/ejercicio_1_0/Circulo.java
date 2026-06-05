package ejercicio_1_0;

public class Circulo extends Figura{
    private double radio;

    public Circulo(){
        this.radio = 1.0;
    }

    public Circulo(double radio){
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
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double perimetro(){
        return Math.PI * (2*radio);
    }
}
