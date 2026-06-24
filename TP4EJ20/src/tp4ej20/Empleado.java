/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ej20;
import java.util.GregorianCalendar;
import java.util.Calendar;
        
/**
 *
 * @author Jazmín
 */
public class Empleado implements Comparable{
    private String nombreApellido;
    private GregorianCalendar fecha;
    private int dni;
    private int anioIngreso;
    
    public Empleado(){}
    public Empleado(String nombreApellido, int dia, int mes, int anio,
            int dni, int anioIngreso){
        this.nombreApellido=nombreApellido;
        this.fecha=new GregorianCalendar(anio, mes, dia);
        this.dni=dni;
        this.anioIngreso=anioIngreso;
    }
    public String getNombreApellido(){
        return this.nombreApellido;
    }
    public GregorianCalendar getFecha(){
        return this.fecha;
    }
    public int getDni(){
        return this.dni;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public void setNombreApellido(String nombreApellido){
        this.nombreApellido=nombreApellido;
    }
    public void setFecha(int dia, int mes, int anio){
        this.fecha=new GregorianCalendar(anio, mes, dia);
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setAnioIngreso(int anioIngreso){
        this.anioIngreso=anioIngreso;
    }
    
    @Override
    public int compareTo(Object o){
        Empleado e = (Empleado) o;
        return this.nombreApellido.compareTo(e.getNombreApellido());
    }
    
    public void detalles(){
        System.out.println("\n");
        System.out.println("Nombre y apellido: " + this.nombreApellido);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH) + 1; //meses inician en 0
        int anio = fecha.get(Calendar.YEAR);
        System.out.println("Fecha de nacimiento: "+anio+"/"+mes+"/"+dia);
        System.out.println("DNI: " + this.dni);
        System.out.println("Ingreso: " + this.anioIngreso);
    }
   
}
