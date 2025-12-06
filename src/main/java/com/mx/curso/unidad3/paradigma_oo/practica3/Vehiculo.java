package com.mx.curso.unidad3.paradigma_oo.practica3;

public class Vehiculo {

    int velocidad;
    int numLlantas;

    public Vehiculo(int numLlantas) {
        this.velocidad = 0;       // velocidad inicial
        this.numLlantas = numLlantas;
    }

    public void acelerar() {
        velocidad += 5;
        System.out.println("El vehículo acelera. Velocidad actual: " + velocidad + " km/h");
    }

}
