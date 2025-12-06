package com.mx.curso.unidad3.paradigma_oo.practica1y2;

public class Principal {

    static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante();
        restaurante1.nombre = "El Palanque";
        restaurante1.tipoDeComida = "Comida Mexicana";
        restaurante1.calificacion = 9;

        Restaurante restaurante2 = new Restaurante();
        restaurante2.nombre = "Golden Dragon";
        restaurante2.tipoDeComida = "Comida China";
        restaurante2.calificacion = 8;

        restaurante1.abrir();
        restaurante2.abrir();

    }

}
