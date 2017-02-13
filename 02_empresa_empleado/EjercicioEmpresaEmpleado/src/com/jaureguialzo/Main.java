package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new ArrayList<>();

        int opcion;
        do {

            System.out.println("1. Crear nueva empresa.\n" +
                    "2. Añadir empleado a empresa ya existente.\n" +
                    "3. Listado de empresas.\n" +
                    "4. Listado detallado de empresas y empleados.\n" +
                    "5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:

                    // Pedir los datos
                    System.out.print("Nombre: ");
                    String nombre = br.readLine();
                    // Validación...
                    System.out.print("Año de fundación: ");
                    String año = br.readLine();
                    // Validación...

                    // Generar el objeto
                    Empresa e = new Empresa(nombre, año);

                    // Almacenar el objeto
                    empresas.add(e);

                    break;
                case 2:
                    if (empresas.size() > 0) {
/*
                        int n = 1;
                        for (Empresa ee : empresas ) {
                            System.out.println(n+", "+ee);
                            n++;
                        }
*/

                        // Elegir la empresa a la que asociar el empleado
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println((i + 1) + ", " + empresas.get(i));
                        }

                        System.out.print("Elige la empresa: ");
                        int numEmpresa = Integer.parseInt(br.readLine()) - 1;

                        // Generar el objeto
                        Empleado emple = new Empleado();

                        System.out.print("Nombre: ");
                        nombre = br.readLine();
                        // Validación...
                        emple.setNombre(nombre);

                        System.out.print("Apellido: ");
                        String apellido = br.readLine();
                        // Validación...
                        emple.setApellido(apellido);

                        System.out.print("Fecha de nacimiento: ");
                        String fechaNac = br.readLine();
                        // Validación...
                        emple.setFechaNacimiento(fechaNac);

                        System.out.print("Fecha de alta: ");
                        String fechaAlta = br.readLine();
                        // Validación...
                        emple.setFechaAlta(fechaAlta);

                        // Almacenar el objeto en la empresa
                        empresas.get(numEmpresa).añadirEmpleado(emple);

                    } else {
                        System.out.println("ERROR: Da de alta una empresa primero...");
                    }
                    break;
                case 3:
                    // Recorrer la colección
                    for (Empresa t : empresas) {
                        System.out.println(t);
                    }

                    break;
                case 4:

                    // Recorrer y delegar en la empresa la visualización
                    for (Empresa t : empresas) {
                        t.visualizar();
                    }

                    break;
            }

        } while (opcion != 5);
    }
}
