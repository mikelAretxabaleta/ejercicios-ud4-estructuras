package com.jaureguialzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widemos on 16/2/17.
 */
public class Asignatura {

    // Propiedades
    private String nombre;
    private int horasSemanales;

    // Asociación
    private List<Alumno> alumnos = new ArrayList<>();

    // Conexión con Alumno
    public void añadirAlumno(Alumno a) {
        alumnos.add(a);
    }

    // Factible pero no aconsejable
/*
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
*/

    public void listaClase() {
        System.out.println("Listado de alumnos matriculados en " + nombre);
        for (Alumno a : alumnos) {
            System.out.println("  Nombre: " + a.getNombre());
            System.out.println("  Apellidos: " + a.getApellidos());
            System.out.println("  Email: " + a.getEmail());
            System.out.println();
        }
    }


    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public Asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemanales=" + horasSemanales +
                '}';
    }
}
