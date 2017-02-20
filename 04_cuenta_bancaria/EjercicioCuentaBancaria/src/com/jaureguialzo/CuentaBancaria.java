package com.jaureguialzo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by widemos on 16/2/17.
 */
public class CuentaBancaria {

    private String codigoCuenta;

    private List<Titular> titulares = new ArrayList<>();

    private List<Apunte> apuntes = new ArrayList<>();


    public void añadirTitular(Titular t) {
        titulares.add(t);
    }

    public void listadoTitulares() {

        System.out.println("Cuenta: " + codigoCuenta);

        for (Titular t : titulares) {
            System.out.println("  Nombre: " + t.getNombre());
            System.out.println("  Apellidos: " + t.getApellidos());
            System.out.println("  DNI: " + t.getDNI());
            System.out.println("  Fecha de alta: " + t.getFechaAlta());
        }
    }

    public void borrarApuntes() {

        // Vaciar la lista de apuntes de la cuenta
        apuntes.clear();

    }

    public void borrarTitulares() {

        //titulares.clear();

        for (Titular t : titulares) {
            t.borrarCuenta(this);
        }

    }


    /**
     * Calcula el saldo de la cuenta
     *
     * @return El resultado de sumar el valor de todos los apuntes
     */
    public double calcularSaldo() {

        double total = 0;

        for (Apunte a : apuntes) {
            total += a.getCantidad();
        }

        return total;
    }

    /**
     * Almacena un nuevo apunte en la cuenta
     *
     * @param cantidad Valor numérico con la cantidad en euros a anotar (positiva o negativa)
     */
    public void nuevoApunte(double cantidad) {

        // https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String fechaActual = dateFormat.format(date);

        Apunte a = new Apunte(cantidad, fechaActual);

        apuntes.add(a);
        a.setCuenta(this);
    }

    public CuentaBancaria(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public CuentaBancaria() {
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "codigoCuenta='" + codigoCuenta + '\'' +
                '}';
    }

}
