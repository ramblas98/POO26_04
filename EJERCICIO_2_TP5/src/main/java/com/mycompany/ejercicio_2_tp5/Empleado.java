/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_2_tp5;

import java.util.GregorianCalendar;

/**
 *
 * @author USUARIO
 */
public class Empleado implements Comparable{
    private String apellidos;
    private String nombres;
    private GregorianCalendar fechaNacimiento;
    private int dni;
    private int anioIngreso;

    public Empleado() {
    }
    
    public Empleado(String apellidos, String nombres, GregorianCalendar fechaNacimiento, int dni, int anioIngreso) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + ", anioIngreso=" + anioIngreso + '}';
    }
    
    @Override
    public int compareTo(Object o){
        Empleado e = (Empleado) o;
        return this.apellidos.compareTo(e.getApellidos());
    }
}
