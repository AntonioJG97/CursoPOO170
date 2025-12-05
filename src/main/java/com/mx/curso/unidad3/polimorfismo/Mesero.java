package com.mx.curso.unidad3.polimorfismo;

public class Mesero extends Empleado{


    @Override
    public double calcularSalario() {
        return 1000;
    }

    @Override
    public String nombre() {
        return "Mesero";
    }

    @Override
    public void saludar() {
        System.out.println("Hola yo soy el mesero");
    }
}
