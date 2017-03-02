package com.jaureguialzo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Persona> A = new HashSet<>();

        A.add(new Persona("Ion1", "1"));
        A.add(new Persona("Ion2", "2"));
        A.add(new Persona("Ion3", "3"));
        A.add(new Persona("Ion4", "4"));
        A.add(new Persona("Ion5", "5"));


        Set<Persona> B = new HashSet<>();

        B.add(new Persona("Carlos1", "11"));
        B.add(new Persona("Carlos2", "2"));
        B.add(new Persona("Carlos3", "13"));
        B.add(new Persona("Carlos4", "14"));
        B.add(new Persona("Carlos5", "15"));


        // Unión sin duplicados
        Set<Persona> caso1 = new HashSet<>(A);
        caso1.addAll(B);

        for (Persona p : caso1) {
            System.out.println(p);
        }

        // Unión admitiendo duplicados
        List<Persona> caso2 = new ArrayList<>(A);

        caso2.addAll(B);

        for (Persona p : caso2) {
            System.out.println(p);
        }

        // Diferencia
        Set<Persona> caso3 = new HashSet<>(A);
        caso3.removeAll(B);

        for (Persona p : caso3) {
            System.out.println(p);
        }

        // Intersección
        Set<Persona> caso4 = new HashSet<>(A);
        caso4.retainAll(B);

        for (Persona p : caso4) {
            System.out.println(p);
        }

    }
}
