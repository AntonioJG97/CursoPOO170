package com.mx.curso.unidad3.herencia.practica01;

public class Verificacion {
    static void main(String[] args) {

        ProductoDigital producto1 = new ProductoDigital("Ebook java",250.20,true);
        ProductoDigital producto2 = new ProductoDigital("Audio Libro",221.10,false);

        System.out.println("Total de productos creados: " + ProductoDigital.getContadorDeProductos());

    }
}
