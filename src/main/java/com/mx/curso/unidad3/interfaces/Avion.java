package com.mx.curso.unidad3.interfaces;

public class Avion implements PuedeVolar{

    @Override
    public void volar() {
        System.out.println("El avion vuela");
    }
}
