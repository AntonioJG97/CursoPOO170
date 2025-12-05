package com.mx.curso.unidad3.polimorfismo;

public abstract class Empleado {

    public void trabajar(){
        System.out.println("El empleado esta trabajando");
    }

    public void saludar(){
        System.out.println("hola a todos!");
    }

    public abstract double calcularSalario();

    public abstract String nombre();

}
