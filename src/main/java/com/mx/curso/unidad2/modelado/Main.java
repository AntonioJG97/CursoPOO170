package com.mx.curso.unidad2.modelado;

public class Main {
    static void main(String[] args) {
        Mascota perro = new Mascota();
        perro.setRaza("Bulldog");
        perro.setEdad(2);

        System.out.println("El perro es un:" + perro.getRaza()+" y tiene "+ perro.getEdad()+" años");
    }
}
