package ejercicio5;

public class main {
    public static void main(String[] args){
        Deposito d1 = new Deposito();

        Locomotora l1 = new Locomotora();
        Locomotora l2 = new Locomotora(2000,4000,8000);

        Formacion f1 = new Formacion(231);
        Formacion f2 = new Formacion(2144);

        f1.agregarLocomotora(l2);
        f2.agregarLocomotora(l1);

        d1.agregarFormacion(f1);
        d1.agregarFormacion(f2);

    }
}
