package com.mx.curso.unidad3.polimorfismo;

public abstract class Empleado {

    public void trabajar(){
        System.out.println("El empleado esta trabajando");
    }

    public abstract double calcularSalario();

    public abstract String nombre();

}
