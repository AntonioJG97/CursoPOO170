package com.mx.curso.unidad3.paradigma_oo.practica4;

public class Rectangulo extends Forma{

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
