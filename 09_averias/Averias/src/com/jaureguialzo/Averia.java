package com.jaureguialzo;

/**
 * Created by widemos on 9/3/17.
 */
public class Averia {

    private String titulo;
    private String descripcion;
    private String fechaApertura;
    private int nivel;

    private Tecnico tecnico;

    public Averia(String titulo, String descripcion, String fechaApertura, int nivel) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Averia{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
