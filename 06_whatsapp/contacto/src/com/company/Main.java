package com.company;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Contacto> contactos = new LinkedHashMap<>();
        // int telefono = 687035444;
        int movil;

        int opcion;
    /*    Contacto contact = new Contacto(telefono, "bruno", "apellido", "gmail");
        contactos.put(telefono, contact);
        System.out.println(contactos);*/

        do {
            System.out.print("agenda\n" +
                    "1) Gestión de contactos\n" +
                    "Nuevo contacto.\n" +
                    "Eliminar contacto.\n" +
                    "2) Búsqueda\n" +
                    "Buscar contacto por número de teléfono.\n" +
                    "Buscar contacto por nombre.\n" +
                    "3) Listados\n" +
                    "Listado de todos los contactos, tal como se han añadido.\n" +
                    "Listado de todos los contactos, ordenados por número de teléfono.\n" +
                    "4) Salir\n" +
                    "Elige una opcion: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

                case 1: {
                    System.out.print(
                            "1) Nuevo contacto\n" +
                                    "2) Eliminar contacto\n" +
                                    "Opcion: ");
                    opcion = Integer.parseInt(br.readLine());

                    switch (opcion) {

                        case 1: {

                            // Nuevo contacto
                            String repuesta;
                            do {
                                System.out.print("Movil: ");
                                movil = Integer.parseInt(br.readLine());
                                System.out.print("Nombre: ");
                                String nombre = br.readLine();
                                System.out.print("Apellido: ");
                                String apellido = br.readLine();
                                System.out.print("Email: ");
                                String email = br.readLine();

                                Contacto contacto = new Contacto(nombre, apellido, email);

                                contactos.put(movil, contacto);

                                System.out.print("añadir nuevo S|N: ");
                                repuesta = br.readLine();
                            } while (!repuesta.equalsIgnoreCase("N"));
                        }
                        break;
                        case 2: {
                            System.out.print("introduce el numero de movil para borrar contacto: ");
                            movil = Integer.parseInt(br.readLine());

/*
                            if( contactos.containsKey(movil) ) {
                                contactos.remove(movil);
                                System.out.println("Contacto borrado.");
                            } else {
                                System.out.println("Contacto inexistente...");
                            }
*/


                            if (contactos.remove(movil) == null) {
                                System.out.println("No se ha borrado nada...");
                            } else {
                                System.out.println("Contacto borrado.");
                            }
                        }
                        break;
                    }
                }
                break;
                case 2: {
                    System.out.print("1) Buscar por telefono\n" +
                            "2) Buscar por nombre\n" +
                            "Opcion: ");
                    opcion = Integer.parseInt(br.readLine());
                    switch (opcion) {

                        case 1: {
                            System.out.print("introduce el movil a buscar: ");
                            movil = Integer.parseInt(br.readLine());
                            System.out.println(contactos.get(movil));
                        }
                        break;
                        case 2: {

                            System.out.print("Nombre a buscar: ");
                            String buscame = br.readLine();

                            for( Map.Entry<Integer,Contacto> posicion : contactos.entrySet() ) {

                                if( posicion.getValue().getNombre().equalsIgnoreCase(buscame) ) {
                                    // Encontrado!!

                                }

                            }


                        }
                        break;
                    }

                }
                break;
                case 3: {
                    System.out.print("1) Listado de contactos por orden de entrada\n" +
                            "2) Ordenados por numero\n" +
                            "opcion: ");
                    opcion = Integer.parseInt(br.readLine());
                    switch (opcion) {


                        case 1: {

                            System.out.println(contactos);

                            for( Map.Entry<Integer,Contacto> posicion : contactos.entrySet() ) {
                                System.out.println("Nombre: "+posicion.getValue().getNombre());
                            }



                        }
                        break;
                        case 2: {

                            Map<Integer, Contacto> ordenados = new TreeMap<>(contactos);

                            ordenados.forEach(
                                    (k,v) -> System.out.println("Telefono: "+k
                                            +", nombre: "+v.getNombre() )
                            );

                        }
                    }
                }
            }
            System.out.println();
        } while (opcion != 4);

    }

}
