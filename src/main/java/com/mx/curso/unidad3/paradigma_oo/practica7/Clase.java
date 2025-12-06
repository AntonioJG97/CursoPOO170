package com.mx.curso.unidad3.paradigma_oo.practica7;

import java.util.ArrayList;

public class Clase {

    String nombreDeClase;
    ArrayList<Estudiante> estudiantes;

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes en la clase " + nombreDeClase + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.nombre);
        }
    }

}
