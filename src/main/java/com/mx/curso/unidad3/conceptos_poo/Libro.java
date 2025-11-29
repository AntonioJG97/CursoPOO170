package com.mx.curso.unidad3.conceptos_poo;

public class Libro extends Material {

    private String autor;

    public Libro(String titulo, int anio, String autor) {
        super(titulo, anio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("LIBRO: " + getTitulo()
                + " | Autor: " + autor
                + " | Año: " + getAnio());
    }
}
