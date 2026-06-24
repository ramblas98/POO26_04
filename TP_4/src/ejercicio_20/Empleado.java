package ejercicio_20;

import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Empleado implements Comparable<Empleado>{
    private String apellidos_nombres;
    private GregorianCalendar fecha_nacimiento;
    private int dni;
    private double anio_ingresa;

    @Override
    public int compareTo(Empleado e){
        return Integer.compare(this.dni,e.dni);
    }

    public Empleado(){
        this.apellidos_nombres = "jl";
        this.fecha_nacimiento = new GregorianCalendar(2000,11,31);
        this.dni = 67676767;
        this.anio_ingresa = 30.500;
    }

    public Empleado(String apellidos_nombres, int anio, int mes, int dia, int dni, double anio_ingresa){
        this.apellidos_nombres = apellidos_nombres;
        this.fecha_nacimiento = new GregorianCalendar(anio,mes,dia);
        this.dni = dni;
        this.anio_ingresa =anio_ingresa;
    }

    public GregorianCalendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getApellidos_nombres() {
        return apellidos_nombres;
    }

    public int getDni() {
        return dni;
    }

    public double getAnio_ingresa() {
        return anio_ingresa;
    }

    public int getEdad(){
        GregorianCalendar hoy = new GregorianCalendar();

        // Extraer año, mes y día de la fecha actual
        int añoActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        // Extraer año, mes y día de la fecha de nacimiento
        int añoNac = fecha_nacimiento.get(Calendar.YEAR);
        int mesNac = fecha_nacimiento.get(Calendar.MONTH);
        int diaNac = fecha_nacimiento.get(Calendar.DAY_OF_MONTH);

        // Calcular edad (años)
        int edad = añoActual - añoNac;

        // Ajustar si aún no ha pasado el cumpleaños de este año
        if (mesActual < mesNac) {
            edad--;
        } else if (mesActual == mesNac && diaActual < diaNac) {
            edad--;
        }

        return edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellidos_nombres(String apellidos_nombres) {
        this.apellidos_nombres = apellidos_nombres;
    }

    public void setFecha_nacimiento(int anio, int mes, int dia) {
        this.fecha_nacimiento = new GregorianCalendar(anio,mes,dia);
    }

    public void setAnio_ingresa(double anio_ingresa) {
        this.anio_ingresa = anio_ingresa;
    }

    public void detallesDeEmpleado(){
        System.out.println("------------------------");
        System.out.println("Nombre y Apellido: " + apellidos_nombres);
        System.out.println("Fecha de Nacimiento: " + fecha_nacimiento.get(Calendar.YEAR) + " / " + fecha_nacimiento.get(Calendar.MONTH) + " / " + fecha_nacimiento.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dni: " + dni);
        System.out.println("Ingreso por anio: " + anio_ingresa);
        System.out.println("------------------------");
    }

}
