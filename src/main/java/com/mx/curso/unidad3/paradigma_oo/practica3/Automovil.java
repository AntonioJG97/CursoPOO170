package com.mx.curso.unidad3.paradigma_oo.practica3;

public class Automovil extends Vehiculo {

    public Automovil() {
        super(4);
    }

    @Override
    public void acelerar() {
        velocidad += 10;
        System.out.println("El automóvil - Velocidad actual: " + velocidad + " km/h");
    }

}
