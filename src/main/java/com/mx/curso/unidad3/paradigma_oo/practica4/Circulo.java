package com.mx.curso.unidad3.paradigma_oo.practica4;

public class Circulo extends Forma{

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 3.1416*radio*radio;
    }
}
