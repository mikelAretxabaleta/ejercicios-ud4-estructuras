package com.jaureguialzo;

/**
 * Created by widemos on 6/2/17.
 */
public class LineaTicket {

    private String producto;
    private double precio;
    private int unidades;

    private Ticket ticket;

    public LineaTicket(String producto, double precio, int unidades) {
        this.producto = producto;
        this.precio = precio;
        this.unidades = unidades;
    }

    public double getTotal() {
        return precio*unidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                ", unidades=" + unidades +
                '}';
    }
}
