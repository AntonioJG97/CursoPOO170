package com.mx.curso.unidad3.paradigma_oo.practica7;

public class Main {

    static void main(String[] args) {
        Clase programacion = new Clase("Programación Orientada a Objetos");

        Estudiante s1 = new Estudiante("Ana Pérez", 01);
        Estudiante s2 = new Estudiante("Luis Hernández", 02);
        Estudiante s3 = new Estudiante("María López", 03);

        programacion.agregarEstudiante(s1);
        programacion.agregarEstudiante(s2);
        programacion.agregarEstudiante(s3);

        programacion.mostrarEstudiantes();
    }
}
