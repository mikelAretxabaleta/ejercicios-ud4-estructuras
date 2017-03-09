package com.jaureguialzo;

/**
 * Created by widemos on 9/3/17.
 */
public class Operario extends Empleado {



    private double salarioHora;
    private int horasContrato;

    public Operario(String nombre, String apellidos, String fechaNacimiento, String fechaContrato, double salarioHora, int horasContrato) {
        super(nombre, apellidos, fechaNacimiento, fechaContrato);
        this.salarioHora = salarioHora;
        this.horasContrato = horasContrato;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellidos='" + this.getApellidos() + '\'' +
                ", fechaNacimiento='" + this.getFechaNacimiento() + '\'' +
                ", fechaContrato='" + this.getFechaContrato() + '\'' +
                ", salarioHora=" + salarioHora +
                ", horasContrato=" + horasContrato +
                '}';
    }
}
