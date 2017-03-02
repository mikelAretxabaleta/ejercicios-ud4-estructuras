package com.jaureguialzo;

/**
 * Created by widemos on 2/3/17.
 */
public class Persona {

    private String nombre;
    private String DNI;

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return DNI != null ? DNI.equals(persona.DNI) : persona.DNI == null;
    }

    @Override
    public int hashCode() {
        return DNI != null ? DNI.hashCode() : 0;
    }
}
