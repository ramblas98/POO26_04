package ejercicio_10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Inmueble im1 = new Inmueble("Eduardo Arias","casa",1200);
        Inmueble im2 = new Inmueble("Pizarro","pen house",9999);

        Disfraz d1 = new Disfraz("vegeta",'S',2500.50);
        Disfraz d2 = new Disfraz("pocoyo",'L',6767.67);

        im1.alquilar(10);
        d1.alquilar(15);

        ArrayList<Rentable> list = new ArrayList<Rentable>();

        list.add(im1);
        list.add(im2);
        list.add(d1);
        list.add(d2);

        for(Rentable i : list){
            if(i.alquilado()){
                i.desocupar();
                System.out.println("Disfraz Desocupado");
            }else{
                System.out.println("Disfraz Alquilado");
            }
        }
    }
}
