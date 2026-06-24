/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej20;
import java.util.Comparator;
/**
 *
 * @author Jazmín
 */
public class OrdenarPorAntiguedad implements Comparator<Empleado>{
    @Override
    public int compare(Empleado e1, Empleado e2){
        return Integer.compare(e1.getAnioIngreso(), e2.getAnioIngreso());
    }
}