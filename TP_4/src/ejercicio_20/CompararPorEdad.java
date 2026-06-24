package ejercicio_20;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1,Empleado e2){
        return Integer.compare(e1.getEdad(),e2.getEdad());
    }
}
