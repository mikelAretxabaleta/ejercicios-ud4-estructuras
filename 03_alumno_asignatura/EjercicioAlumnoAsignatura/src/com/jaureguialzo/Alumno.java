package com.jaureguialzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widemos on 16/2/17.
 */
public class Alumno {

    // Propiedades
    private String nombre;
    private String apellidos;
    private String email;

    // Asociación
    private List<Asignatura> asignaturas = new ArrayList<>();


    public void visualizarMatricula() {
        System.out.println("Datos de mátricula de " + nombre);
        int total = 0;
        for (Asignatura a : asignaturas) {
            System.out.println("  Nombre: " + a.getNombre());
            System.out.println("  Horas: " + a.getHorasSemanales());
            total += a.getHorasSemanales();
        }
        System.out.println("Total de horas de matrícula: " + total);
    }

    // Conexión con Asignatura
    public void añadirAsignatura(Asignatura a) {
        asignaturas.add(a);
    }


    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
