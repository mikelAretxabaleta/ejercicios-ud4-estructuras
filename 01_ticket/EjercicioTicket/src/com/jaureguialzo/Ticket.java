package com.jaureguialzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by widemos on 6/2/17.
 */
public class Ticket {

    private List<LineaTicket> lineas = new ArrayList<>();

    public void añadirLinea(LineaTicket l) {
        lineas.add(l);
        l.setTicket(this);
    }

    public void imprimir() {

        double total = 0.0;

        for (LineaTicket linea : lineas) {
            System.out.println(linea+", total: "+linea.getTotal());
            total += linea.getTotal();
        }

        System.out.println("Total a pagar: "+total);
    }

}
