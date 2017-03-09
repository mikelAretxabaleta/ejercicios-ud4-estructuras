package com.jaureguialzo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by widemos on 9/3/17.
 */
public class Tecnico {

    private String nombre;
    private int nivel;

    private List<Averia> averias = new ArrayList<>();

    private LinkedList<Averia> pendientes = new LinkedList<>();


    public void añadirAveria(Averia a) {
        averias.add(a);
        pendientes.addLast(a);
        a.setTecnico(this);
    }

    public void atenderSiguienteAveria() {

        if (pendientes.size() > 0) {
            Averia averia = pendientes.removeFirst();

            if (nivel >= averia.getNivel()) {
                System.out.println("INFO: Avería resuelta");
            } else {
                System.out.println("INFO: Avería NO resuelta...");

                averia.setNivel(averia.getNivel() - 1);
                pendientes.addLast(averia);
            }
        } else {
            System.out.println("ERROR: No hay averías pendientes...");
        }
    }

    public void listadoPendientes() {
        for (Averia a : pendientes) {
            System.out.println(a);
        }
    }

    public void listadoAverias() {
        for (Averia a : pendientes) {
            System.out.println(a);
        }
    }

    public Tecnico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
