package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Lista de alumnos del centro
        List<Alumno> alumnos = new ArrayList<>();

        // Lista de asignaturas del centro
        List<Asignatura> asignaturas = new ArrayList<>();

        // Datos de pruebas
/*
        alumnos.add(new Alumno("Ion1", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        alumnos.add(new Alumno("Ion2", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        alumnos.add(new Alumno("Ion3", "Jaureguialzo", "ijaureguialzo@egibide.org"));
        alumnos.add(new Alumno("Ion4", "Jaureguialzo", "ijaureguialzo@egibide.org"));

        asignaturas.add(new Asignatura("Matemáticas", 2));
        asignaturas.add(new Asignatura("Física", 4));
        asignaturas.add(new Asignatura("Lenguaje", 5));
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        do {
            System.out.println("1. Crear nuevo alumno.\n" +
                    "2. Crear nueva asignatura.\n" +
                    "3. Matricular alumno en asignatura.\n" +
                    "4. Listado de alumnos matriculados en una asignatura.\n" +
                    "5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                    "6. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1: {

                    // Nuevo alumno

                    System.out.println("Nombre: ");
                    String nombre = br.readLine();
                    System.out.println("Apellidos: ");
                    String apellidos = br.readLine();
                    System.out.println("Email: ");
                    String email = br.readLine();

                    // Instanciar un Alumno
                    Alumno a = new Alumno(nombre, apellidos, email);

                    // Añadir el alumno a la lista del centro
                    alumnos.add(a);
                }
                break;
                case 2: {
                    // Nueva asignatura

                    System.out.println("Nombre: ");
                    String nombre = br.readLine();
                    System.out.println("Horas semanales: ");
                    int horasSemanales = Integer.parseInt(br.readLine());

                    // Instanciar la Asignatura
                    Asignatura a = new Asignatura(nombre, horasSemanales);

                    // Añadir la asignatura a la lista del centro
                    asignaturas.add(a);

                }
                break;
                case 3: {

                    // Seleccionar un alumno

                    // Visualizar todos los alumno
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.println((i + 1) + ": " + alumnos.get(i));
                    }

                    // Pedir al usuario cual quiere
                    System.out.print("Selecciona un alumno: ");
                    int numAlumno = Integer.parseInt(br.readLine()) - 1;


                    // Seleccionar una asignatura
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println((i + 1) + ": " + asignaturas.get(i));
                    }

                    System.out.print("Selecciona una asignatura: ");
                    int numAsignatura = Integer.parseInt(br.readLine()) - 1;


                    // Conectar alumno con asignatura

                    // Buscar los dos objetos implicados
                    Alumno alumnoSeleccionado = alumnos.get(numAlumno);
                    Asignatura asignaturaSeleccionada = asignaturas.get(numAsignatura);

                    // Guardar la asignatura en el alumno
                    alumnoSeleccionado.añadirAsignatura(asignaturaSeleccionada);

                    // Guardar el alumno en la asignatura
                    asignaturaSeleccionada.añadirAlumno(alumnoSeleccionado);

                    System.out.println();
                }
                break;
                case 4: {

                    // Seleccionar una asignatura
                    for (int i = 0; i < asignaturas.size(); i++) {
                        System.out.println((i + 1) + ": " + asignaturas.get(i));
                    }

                    System.out.print("Selecciona una asignatura: ");
                    int numAsignatura = Integer.parseInt(br.readLine()) - 1;

                    // Mostrar la lista de clase
                    asignaturas.get(numAsignatura).listaClase();

                }
                break;
                case 5: {

                    // Visualizar todos los alumno
                    for (int i = 0; i < alumnos.size(); i++) {
                        System.out.println((i + 1) + ": " + alumnos.get(i));
                    }

                    // Pedir al usuario cual quiere
                    System.out.print("Selecciona un alumno: ");
                    int numAlumno = Integer.parseInt(br.readLine()) - 1;

                    // Mostrar las asignaturas en las que está matriculado
                    alumnos.get(numAlumno).visualizarMatricula();
                }
                break;
            }

            System.out.println();
        } while (opcion != 6);
    }
}
