package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


        // Lista de todos los titulares del banco
        List<Titular> titulares = new ArrayList<>();

        // Lista de todas las cuentas del banco
        List<CuentaBancaria> cuentas = new LinkedList<>();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("Titular\n" +
                    "  1. Nuevo titular\n" +
                    "Cuenta bancaria\n" +
                    "  2. Nueva cuenta\n" +
                    "  3. Nuevo apunte\n" +
                    "  4. Borrar cuenta\n" +
                    "Consultas\n" +
                    "  5. Dado un titular, saldo de todas sus cuentas\n" +
                    "  6. Dada una cuenta, titulares asociados\n" +
                    "7. Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: {

                    // Nuevo titular

                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    System.out.print("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.print("DNI: ");
                    String DNI = br.readLine();
                    System.out.print("Fecha de alta: ");
                    String fechaAlta = br.readLine();

                    Titular t = new Titular(nombre, apellidos, DNI, fechaAlta);

                    titulares.add(t);
                }
                break;

                case 2: {

                    // Nueva cuenta

                    // Verificar si hay titulares
                    if (titulares.size() > 0) {

                        // Seleccionar un titular
                        for (int i = 0; i < titulares.size(); i++) {
                            System.out.println((i + 1) + ": " + titulares.get(i));
                        }

                        System.out.print("Elige titular: ");
                        int titularSeleccionado = Integer.parseInt(br.readLine()) - 1;

                        // Crear la cuenta y asociarla al titular

                        System.out.print("Número de cuenta: ");
                        String cc = br.readLine();

                        CuentaBancaria c = new CuentaBancaria(cc);

                        // Asociar el Titular y su CuentaBancaria

                        cuentas.add(c);

                        Titular ts = titulares.get(titularSeleccionado);

                        ts.añadirCuenta(c);
                        c.añadirTitular(ts);

                    } else {
                        System.out.println("ERROR: Para poder crear una cuenta, tienes que dar de alta un titular...");
                    }
                }
                break;

                case 3: {

                    // Nuevo apunte

                    // Seleccionar una cuenta
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println((i + 1) + ": " + cuentas.get(i));
                    }

                    System.out.print("Elige cuenta: ");
                    int cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    CuentaBancaria c = cuentas.get(cuentaSeleccionada);

                    // Pedir la cantidad
                    System.out.print("Cantidad: ");
                    double cantidad = Double.parseDouble(br.readLine());

                    // Delegar en la CuentaBancaria
                    c.nuevoApunte(cantidad);

                }
                break;

                case 5: {

                    // Dado un titular, saldo de todas sus cuentas

                    // Seleccionar un titular
                    for (int i = 0; i < titulares.size(); i++) {
                        System.out.println((i + 1) + ": " + titulares.get(i));
                    }

                    System.out.print("Elige titular: ");
                    int titularSeleccionado = Integer.parseInt(br.readLine()) - 1;

                    Titular ts = titulares.get(titularSeleccionado);

                    ts.listadoSaldos();
                }
                break;

                case 6: {

                    // Dada una cuenta, titulares asociados

                    // Seleccionar una cuenta
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println((i + 1) + ": " + cuentas.get(i));
                    }

                    System.out.print("Elige cuenta: ");
                    int cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    CuentaBancaria c = cuentas.get(cuentaSeleccionada);

                    c.listadoTitulares();
                }
                break;

                case 4: {

                    // Borrar una cuenta

                    // Seleccionar una cuenta
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.println((i + 1) + ": " + cuentas.get(i));
                    }

                    System.out.print("Elige cuenta: ");
                    int cuentaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                    CuentaBancaria c = cuentas.get(cuentaSeleccionada);

                    c.borrarApuntes();
                    c.borrarTitulares();
                    cuentas.remove(c);
                    c = null;

                }
                break;

            }

            System.out.println();
        } while (opcion != 7);

    }
}
