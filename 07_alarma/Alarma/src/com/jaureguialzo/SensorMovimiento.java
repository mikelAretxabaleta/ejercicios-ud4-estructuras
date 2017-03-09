package com.jaureguialzo;

import java.util.Random;

/**
 * Created by widemos on 9/3/17.
 */
public class SensorMovimiento {

    // Propiedades
    private int umbral;

    private Random r = new Random();

    // Métodos del sensor
    public boolean hayMovimiento() {
        return r.nextInt(100) + 1 > umbral;
    }

    // Asociación
    private Alarma alarma;

    // Código generado

    public SensorMovimiento(int umbral) {
        this.umbral = umbral;
    }

    public SensorMovimiento() {
        umbral = r.nextInt(100) + 1;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    @Override
    public String toString() {
        return "SensorMovimiento{" +
                "umbral=" + umbral +
                '}';
    }
}
