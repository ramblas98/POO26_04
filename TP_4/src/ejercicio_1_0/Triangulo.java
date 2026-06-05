package ejercicio_1_0;

public class Triangulo extends Figura{
    private double a;
    private double b;
    private double c;

    public Triangulo(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void tipoDeTriangulo(){
        if(a == b && b == c && a == c){
            System.out.println("Es Equilatero");
        }

        if(a == b && c != a && c != b){
            System.out.println("Es isosceles");
        } else if (a == c && b != a && b != c) {
            System.out.println("Es isosceles");
        } else if (b == c && a != b && a != c) {
            System.out.println("Es isosceles");
        }else{
            System.out.println("No es isosceles");
        }

        if(a != b && b != c && a != c){
            System.out.println("Es un triangulo escaleno");
        }
        double angulo1 = Math.atan2(a,b);
        double angulo2 = Math.atan2(a,c);
        double angulo3 = Math.atan2(b,c);
        double grados1 = Math.toDegrees(angulo1);
        double grados2 = Math.toDegrees(angulo2);
        double grados3 = Math.toDegrees(angulo3);

        if(grados1 == 90 || grados2 == 90 || grados3 == 90){
            System.out.println("Es un triangulo rectangulo");
        }
    }

    @Override
    public double area(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimetro(){
        return a + b + c;
    }
}
