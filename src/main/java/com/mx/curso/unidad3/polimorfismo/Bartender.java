package com.mx.curso.unidad3.polimorfismo;

public class Bartender extends Empleado{


    @Override
    public double calcularSalario() {
        return 1100;
    }

    @Override
    public String nombre() {
        return "Bartander";
    }
}
