package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Tecnico> tecnicos = new ArrayList<>();
        List<Averia> averias = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.println("1. Alta de técnico.\n" +
                    "Gestión de averías\n" +
                    "2. Nueva avería.\n" +
                    "3. Asignar avería a técnico.\n" +
                    "4. Atender avería.\n" +
                    "Listados\n" +
                    "5. Listado de averías sin resolver de un técnico.\n" +
                    "6. Listado de todas las averías de un técnico (resueltas y no resueltas).\n" +
                    "7. Listado de todas las averías del sistema y técnico asignado.\n" +
                    "8. Salir\n");

            System.out.print("Opción: ");
            try {
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1: {
                        // Alta de técnico

                        System.out.print("Nombre: ");
                        String nombre = br.readLine();
                        System.out.print("Nivel: ");
                        int nivel = Integer.parseInt(br.readLine());

                        tecnicos.add(new Tecnico(nombre, nivel));
                    }
                    break;
                    case 2: {
                        // Nueva avería

                        System.out.print("Título: ");
                        String titulo = br.readLine();
                        System.out.print("Descripción: ");
                        String descripcion = br.readLine();
                        System.out.print("Fecha de apertura: ");
                        String fechaApertura = br.readLine();
                        System.out.print("Nivel: ");
                        int nivel = Integer.parseInt(br.readLine());

                        averias.add(new Averia(titulo, descripcion, fechaApertura, nivel));
                    }
                    break;
                    case 3: {
                        // Asignar avería a técnico
                        if (averias.size() > 0 && tecnicos.size() > 0) {

                            // Elegir avería
                            for (int i = 0; i < averias.size(); i++) {
                                System.out.println((i + 1) + ": " + averias.get(i));
                            }
                            System.out.println("Elige avería: ");
                            int averiaSeleccionada = Integer.parseInt(br.readLine()) - 1;

                            // Elegir técnico
                            for (int i = 0; i < tecnicos.size(); i++) {
                                System.out.println((i + 1) + ": " + tecnicos.get(i));
                            }
                            System.out.println("Elige técnico: ");
                            int tecnicoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                            tecnicos.get(tecnicoSeleccionado).añadirAveria(averias.get(averiaSeleccionada));

                        } else {
                            System.out.println("ERROR: Debe haber al menos una avería y un técnico...");
                        }
                    }
                    break;
                    case 4: {
                        // Atender avería
                        if (tecnicos.size() > 0) {

                            // Elegir técnico
                            for (int i = 0; i < tecnicos.size(); i++) {
                                System.out.println((i + 1) + ": " + tecnicos.get(i));
                            }
                            System.out.println("Elige técnico: ");
                            int tecnicoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                            tecnicos.get(tecnicoSeleccionado).atenderSiguienteAveria();

                        } else {
                            System.out.println("ERROR: Debe haber al menos un técnico...");
                        }
                    }
                    break;
                    case 5: {
                        // Listado de averías sin resolver de un técnico
                        if (tecnicos.size() > 0) {

                            // Elegir técnico
                            for (int i = 0; i < tecnicos.size(); i++) {
                                System.out.println((i + 1) + ": " + tecnicos.get(i));
                            }
                            System.out.println("Elige técnico: ");
                            int tecnicoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                            tecnicos.get(tecnicoSeleccionado).listadoPendientes();

                        } else {
                            System.out.println("ERROR: Debe haber al menos un técnico...");
                        }
                    }
                    break;
                    case 6: {
                        // Listado de todas las averías de un técnico (resueltas y no resueltas)
                        if (tecnicos.size() > 0) {

                            // Elegir técnico
                            for (int i = 0; i < tecnicos.size(); i++) {
                                System.out.println((i + 1) + ": " + tecnicos.get(i));
                            }
                            System.out.println("Elige técnico: ");
                            int tecnicoSeleccionado = Integer.parseInt(br.readLine()) - 1;

                            tecnicos.get(tecnicoSeleccionado).listadoAverias();

                        } else {
                            System.out.println("ERROR: Debe haber al menos un técnico...");
                        }
                    }
                    break;
                    case 7: {
                        // Listado de todas las averías del sistema y técnico asignado
                        if (averias.size() > 0 && tecnicos.size() > 0) {

                            for (Averia a : averias) {
                                System.out.println(a);
                                System.out.println(a.getTecnico());
                            }

                        } else {
                            System.out.println("ERROR: Debe haber al menos una avería y un técnico...");
                        }
                    }
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Escribe un número...");
            }

        } while (opcion != 8);
    }
}
