package ejercicio5;

public class main {
    public static void main(String[] args){
        System.out.println("Nuevo Deposito!");
        Deposito d1 = new Deposito();

        Formacion f1 = new Formacion(231);
        Formacion f2 = new Formacion(2144);

        System.out.println("Se creo 2 Formaciones!");
        Locomotora l1 = new Locomotora();
        Locomotora l2 = new Locomotora(2000,4000,8000);

        System.out.println("Se creo 2 Locomotoras para la formacion 1!");
        f1.agregarVagon(new VagonPasajero());
        f1.agregarVagon(new VagonCarga());
        System.out.println("Se creo 2 Vagones para La formacion 1!");
        f1.agregarLocomotora(l2);
        f1.agregarLocomotora(l1);
        System.out.println("Se Agrego las 2 Locomotoras a la Formacion 1!");


        System.out.println("La formacion 1 Puede moverse?:");
        System.out.println(f1.puedeMoverse());
        d1.agregarFormacion(f1);
        d1.agregarFormacion(f2);

        System.out.println("3 Locomotoras sueltas creadas");
        Locomotora sl1 = new Locomotora();
        Locomotora sl2 = new Locomotora();
        Locomotora sl3 = new Locomotora();

        System.out.println("3 Locomotoras sueltas Agregadas!");
        d1.agregarLocomotoraSuelta(sl1);
        d1.agregarLocomotoraSuelta(sl2);
        d1.agregarLocomotoraSuelta(sl3);

    }
}
