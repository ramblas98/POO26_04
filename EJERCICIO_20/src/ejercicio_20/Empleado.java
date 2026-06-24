/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_20;

import java.time.LocalDate;
import java.time.Period;

public class Empleado implements Comparable<Empleado>{
    private String apellidos;
    private String nombres;
    private LocalDate fechaNacimiento;
    private String dni;
    private int anioIngreso;

    public Empleado(String apellidos, String nombres, LocalDate fechaNacimiento,
                    String dni, int anioIngreso) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public int compareTo(Empleado otro) {
        return this.apellidos.compareToIgnoreCase(otro.apellidos);
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int getAnioIngreso() { return anioIngreso; }

    @Override
    public String toString() {
        return apellidos + ", " + nombres +
               " | DNI: " + dni +
               " | Edad: " + getEdad() +
               " | Ingreso: " + anioIngreso;
    }
}
