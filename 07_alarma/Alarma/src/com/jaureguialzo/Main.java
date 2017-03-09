package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alarma alarma = new Alarma();

        int opcion = 0;
        do {
            System.out.println("1. Activar alarma\n" +
                    "2. Desactivar alarma (necesario PIN)\n" +
                    "3. Consultar sensores\n" +
                    "4. Salir");

            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1: {
                        System.out.println("INFO: Activando la alarma...");
                        alarma.activar();
                    }
                    break;
                    case 2: {
                        System.out.print("Introduce el PIN para desactivar: ");

                        int pin;
                        try {
                            pin = Integer.parseInt(br.readLine());
                            alarma.desactivar(pin);
                        } catch (NumberFormatException e) {
                            System.out.println("ERROR: Escribe un número...");
                        }
                    }
                    break;
                    case 3: {
                        alarma.consultarSensores();
                    }
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Escribe un número...");
            }

        } while (opcion != 4);

    }
}
