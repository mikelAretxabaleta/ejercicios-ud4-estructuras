package com.jaureguialzo;

import sun.management.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by widemos on 9/3/17.
 */
public class Alarma {

    // Propiedades
    private int pin;
    private boolean activada;
    private int telefonoAviso;

    private Random r = new Random();
    private int numSensores = 0;
    private int intentos = 3;

    // Asociación
    List<SensorMovimiento> sensores = new ArrayList<>();

    // Métodos de la alarma
    public void consultarSensores() {

        if (activada) {
            int activados = 0;

            for (int i = 0; i < numSensores; i++) {
                SensorMovimiento s = sensores.get(i);

                if (s.hayMovimiento()) {
                    System.out.println("INFO: Sensor " + i + ": ON");
                    activados += 1;
                } else {
                    System.out.println("INFO: Sensor " + i + ": OFF");
                }
            }

            if (activados > 0) {
                System.out.println("¡¡¡ A L A R M A !!!");
            } else {
                System.out.println("INFO: Todo en orden...");
            }

        } else {
            System.out.println("ERROR: La alarma no está activada...");
        }
    }

    public void activar() {
        System.out.println("INFO: Alarma activada");
        activada = true;
    }

    public void desactivar(int pin) {

        if (activada) {
            if (pin == this.pin) {
                System.out.println("INFO: Alarma desactivada");
                activada = false;
                intentos = 3;
            } else {
                intentos -= 1;
                if (intentos > 0) {
                    System.out.println("ERROR: Quedan " + intentos + " intentos...");
                } else {
                    System.out.println("¡¡¡ A L A R M A !!!");
                    intentos = 3;
                }
            }
        } else {
            System.out.println("ERROR: La alarma no está activada...");
        }
    }

    // Código generado automáticamente
    public Alarma(int pin, boolean activada, int telefonoAviso) {
        this.pin = pin;
        this.activada = activada;
        this.telefonoAviso = telefonoAviso;
    }

    public Alarma() {

        // Calcular el PIN
        pin = r.nextInt(10000);

        System.out.format("INFO: El PIN calculado es: %04d\n\n", pin);

        // ¿Cuantos sensores hay que crear?
        numSensores = r.nextInt(5) + 1;

        for (int i = 0; i < numSensores; i++) {

            // Crear cada uno y conectarlo a la alarma
            SensorMovimiento sensor = new SensorMovimiento();

            sensores.add(sensor);
            sensor.setAlarma(this);
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "pin=" + pin +
                ", activada=" + activada +
                ", telefonoAviso=" + telefonoAviso +
                '}';
    }

}
