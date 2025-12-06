package com.mx.curso.unidad3.paradigma_oo.practica5;

public class Main {

    static void main(String[] args) {
        Encendible[] dispositivos = new Encendible[2];

        dispositivos[0] = new Tv();
        dispositivos[1] = new Bombilla();

        for (Encendible d : dispositivos) {
            d.encender();
            d.apagar();
        }
    }

}
