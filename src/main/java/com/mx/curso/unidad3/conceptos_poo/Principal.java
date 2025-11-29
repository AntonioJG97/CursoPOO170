package com.mx.curso.unidad3.conceptos_poo;

public class Principal {

    public static void main(String[] args) {

        Material m1 = new Libro("El principito", 1943, "Antoine de Saint-Exupéry");
        Material m2 = new Revista("National Geographic", 2023, 150);
        Material m3 = new Libro("Clean Code", 2008, "Robert C. Martin");

        Material[] materiales = { m1, m2, m3 };

        System.out.println("Lista de materiales en la biblioteca");

        for (Material mat : materiales) {
            mat.mostrarInformacion(); // Polimorfismo
        }
    }
}
