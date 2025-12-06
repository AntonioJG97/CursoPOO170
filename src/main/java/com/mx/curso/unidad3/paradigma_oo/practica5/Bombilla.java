package com.mx.curso.unidad3.paradigma_oo.practica5;

public class Bombilla implements Encendible{

    @Override
    public void encender() {
        System.out.println("Bombilla encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Bombilla apagada");
    }

}
