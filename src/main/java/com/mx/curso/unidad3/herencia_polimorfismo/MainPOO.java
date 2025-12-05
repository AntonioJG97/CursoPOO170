package com.mx.curso.unidad3.herencia_polimorfismo;

public class MainPOO {

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        Animal[] animales = new Animal[2];

        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal a : animales) {
            a.hacerSonido();
        }

    }

}
