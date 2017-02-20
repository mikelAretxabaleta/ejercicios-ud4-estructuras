package com.jaureguialzo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by widemos on 16/2/17.
 */
public class Titular {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String fechaAlta;


    private List<CuentaBancaria> cuentas = new LinkedList<>();

    public void añadirCuenta(CuentaBancaria c) {
        cuentas.add(c);
    }

    public void borrarCuenta(CuentaBancaria c) {
        cuentas.remove(c);
    }

    public void listadoSaldos() {

        System.out.println("Titular: " + nombre + " " + apellidos);

        double total = 0;

        for (CuentaBancaria c : cuentas) {
            System.out.println("    Cuenta: " + c.getCodigoCuenta());

            double saldo = c.calcularSaldo();

            System.out.println("    Saldo: " + saldo);
            total += saldo;
        }

        System.out.println("  Posición global: " + total);
    }

    public Titular() {
    }

    public Titular(String nombre, String apellidos, String DNI, String fechaAlta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaAlta = fechaAlta;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fechaAlta='" + fechaAlta + '\'' +
                '}';
    }

}
