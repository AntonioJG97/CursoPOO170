package com.mx.curso.unidad3.paradigma_oo.practica1y2;

public class Empleado {

    private int id = 0;
    private double salario = 0.0;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumantarSalario(double porcentaje){
        salario = salario + (salario*(porcentaje/100));
    }
}
