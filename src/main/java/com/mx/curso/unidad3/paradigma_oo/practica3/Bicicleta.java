package com.mx.curso.unidad3.paradigma_oo.practica3;

public class Bicicleta extends Vehiculo{

    public Bicicleta() {
        super(2);
    }

    @Override
    public void acelerar() {
        velocidad += 2;
        System.out.println("La bicicleta - Velocidad actual: " + velocidad + " km/h");
    }

}
