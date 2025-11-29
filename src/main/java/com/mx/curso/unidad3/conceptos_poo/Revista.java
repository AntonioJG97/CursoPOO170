package com.mx.curso.unidad3.conceptos_poo;

public class Revista extends Material {

    private int numeroEdicion;

    public Revista(String titulo, int anio, int numeroEdicion) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public void mostrarInformacion() {
        System.out.println("REVISTA: " + getTitulo()
                + " | Año: " + getAnio()
                + " | Edición: " + numeroEdicion);
    }
}
