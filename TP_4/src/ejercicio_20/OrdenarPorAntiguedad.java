package ejercicio_20;

import java.util.Calendar;
import java.util.Comparator;

public class OrdenarPorAntiguedad implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1,Empleado e2){
        int anio = Integer.compare(e1.getFecha_nacimiento().get(Calendar.YEAR),e2.getFecha_nacimiento().get(Calendar.YEAR));
        if(anio != 0){
            return anio;
        }
        int mes = Integer.compare(e1.getFecha_nacimiento().get(Calendar.MONTH),e2.getFecha_nacimiento().get(Calendar.MONTH));
        if(mes != 0){
            return mes;
        }

        return Integer.compare(e1.getFecha_nacimiento().get(Calendar.DAY_OF_MONTH),e2.getFecha_nacimiento().get(Calendar.DAY_OF_MONTH));
    }
}
