/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_20;

import java.util.Comparator;

public class CompareEmpEdad implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {  // ← Empleado, no Object
        return Integer.compare(e2.getEdad(), e1.getEdad());
    }
}
