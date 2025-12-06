package com.mx.curso.unidad3.paradigma_oo.practica4;

public class Main {

    static void main(String[] args) {
        Forma[] formas = new Forma[2];

        formas[0] = new Circulo(8);
        formas[1] = new Rectangulo(6, 10);

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }

}
