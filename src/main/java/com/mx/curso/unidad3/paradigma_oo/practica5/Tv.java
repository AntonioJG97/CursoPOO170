package com.mx.curso.unidad3.paradigma_oo.practica5;

public class Tv implements Encendible{

    @Override
    public void encender() {
        System.out.println("TV encendida");
    }

    @Override
    public void apagar() {
        System.out.println("TV apagada");
    }
}
