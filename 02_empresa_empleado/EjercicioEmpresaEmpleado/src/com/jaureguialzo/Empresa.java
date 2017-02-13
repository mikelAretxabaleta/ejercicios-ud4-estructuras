package com.jaureguialzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widemos on 13/2/17.
 */
public class Empresa {

    private String nombre;
    private String añoFundacion;


    private List<Empleado> empleados = new ArrayList<>();

    public void añadirEmpleado(Empleado e) {

        empleados.add(e);
        e.setEmpresa(this);

    }

    public void visualizar() {
        System.out.println("Datos de la empresa: " + nombre);
        System.out.println("Año de fundación: " + añoFundacion);
        System.out.println("Lista de empleados: ");

        for (Empleado e : empleados) {
            System.out.println("  Nombre: " + e.getNombre());
            System.out.println("  Apellido: " + e.getApellido());
            System.out.println("  Fecha de nacimiento: " + e.getFechaNacimiento());
            System.out.println("  Fecha de alta: " + e.getFechaAlta());
        }
    }


    public Empresa(String nombre, String añoFundacion) {
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(String añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", añoFundacion='" + añoFundacion + '\'' +
                '}';
    }
}
