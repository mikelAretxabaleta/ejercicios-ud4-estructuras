package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG07 on 09/03/2017.
 */
public class BaseDatos1 {



    private static List<Empresa> empresas = new ArrayList<>();
    private static List<Empleado> empleados = new ArrayList<>();

    public static void start() throws IOException {

        Interfaz i=new Interfaz();

        i.interfaz();


    }


    public static List<Empresa> getEmpresas() {
        return empresas;
    }

    public static List<Empleado> getEmpleados() {
        return empleados;
    }
}


