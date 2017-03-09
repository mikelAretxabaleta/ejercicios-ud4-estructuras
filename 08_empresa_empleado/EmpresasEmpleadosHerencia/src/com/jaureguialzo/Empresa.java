package com.jaureguialzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widemos on 9/3/17.
 */
public class Empresa {

    private String nombre;
    private String anyoFundacion;

    private List<Empleado> empleados = new ArrayList<>();

    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyoFundacion='" + anyoFundacion + '\'' +
                '}';
    }
}


