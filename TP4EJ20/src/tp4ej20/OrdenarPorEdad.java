/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej20;
import java.util.Comparator;
//import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Jazmín
 */
public class OrdenarPorEdad implements Comparator<Empleado>{
    @Override
    public int compare(Empleado e1, Empleado e2){
        int anio=Integer.compare(e1.getFecha().get(Calendar.YEAR), e2.getFecha().get(Calendar.YEAR));
        if(anio!=0){
            return anio;
        }
        int mes=Integer.compare(e1.getFecha().get(Calendar.MONTH), e2.getFecha().get(Calendar.MONTH));
        if(mes!=0){
            return mes;
        }
        return Integer.compare(e1.getFecha().get(Calendar.DAY_OF_MONTH), e2.getFecha().get(Calendar.DAY_OF_MONTH));
    }
}