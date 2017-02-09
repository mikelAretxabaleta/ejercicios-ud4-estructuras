package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Ticket t = new Ticket();

        String respuesta;
        do {

            System.out.print("Producto: ");
            String producto = br.readLine();
            System.out.print("Precio: ");
            double precio = Double.parseDouble(br.readLine());
            System.out.print("Unidades: ");
            int unidades = Integer.parseInt(br.readLine());

            LineaTicket nuevaLinea = new LineaTicket(producto, precio, unidades);

            t.añadirLinea(nuevaLinea);

            System.out.print("¿Quieres añadir más? (s/n): ");
            respuesta = br.readLine();

        } while (!respuesta.equalsIgnoreCase("N"));

        t.imprimir();

    }
}
