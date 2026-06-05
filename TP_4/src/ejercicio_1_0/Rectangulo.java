package ejercicio_1_0;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(){
        this.base = 5.0;
        this.altura = 8.0;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area(){
        return base * altura;
    }

    @Override
    public double perimetro(){
        return 2 * base + 2 * altura;
    }
}
