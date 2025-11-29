package com.mx.curso.unidad3.conceptos_poo;

public class Material {

    private String titulo;
    private int anio;

    public Material(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void mostrarInformacion() {
        System.out.println("Material: " + titulo + " (" + anio + ")");
    }
}

