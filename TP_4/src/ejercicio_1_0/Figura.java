package ejercicio_1_0;

public class Figura {
    public double area(){
        return 0.0;
    }

    public boolean mismaArea(Figura f){
        if(this.area() == f.area()){
            return true;
        }else{
            return false;
        }
    }

    public double perimetro(){
        return 0;
    }
}
