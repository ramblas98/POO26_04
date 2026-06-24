package ejercicio_20;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<Empleado>();
        listaDeEmpleados.add(new Empleado("Jose pepe",2000,3,15,99991,50000.100));
        listaDeEmpleados.add(new Empleado("Pocoyo Fernandez",1980,9,21,99995,93736.100));
        listaDeEmpleados.add(new Empleado("Gojo Saturado",1999,10,25,99992,17234.100));
        listaDeEmpleados.add(new Empleado("Deku Martinez",2003,1,11,99997,55382.100));
        listaDeEmpleados.add(new Empleado("Emilia jujenia",1989,6,30,999914,93663.100));
        listaDeEmpleados.add(new Empleado("Zon Pepe",1700,7,10,99998,71123.100));
        Collections.sort(listaDeEmpleados);
        for(Empleado i : listaDeEmpleados){
            i.detallesDeEmpleado();
        }
        System.out.println("=================================================");
        Collections.sort(listaDeEmpleados, new CompararPorEdad());
        System.out.println("=================================================");
        for(Empleado i : listaDeEmpleados){
            i.detallesDeEmpleado();
        }
        System.out.println("=================================================");
        Collections.sort(listaDeEmpleados, new OrdenarPorAntiguedad());
        System.out.println("=================================================");
        for(Empleado i : listaDeEmpleados){
            i.detallesDeEmpleado();
        }
    }
}
