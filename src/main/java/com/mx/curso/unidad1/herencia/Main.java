package com.mx.curso.unidad1.herencia;

public class Main {
    static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Antonio");
        System.out.println("Nombre:"+ persona.getNombre());

        Car car = new Car();
        car.setMarca("TOYOTA");
        car.setModelo("Yaris");
        car.setAño(2025);
        System.out.println("Se vende:" + car.getMarca()+" "+car.getModelo()+" "+car.getAño());
    }
}
