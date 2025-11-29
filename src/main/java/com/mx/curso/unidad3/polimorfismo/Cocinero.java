package com.mx.curso.unidad3.polimorfismo;

public class Cocinero extends Empleado{


    @Override
    public double calcularSalario() {
        return 1500;
    }

    @Override
    public String nombre() {
        return "Cocinero";
    }
}
