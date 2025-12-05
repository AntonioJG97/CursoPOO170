package com.mx.curso.unidad3.interfaces;

public class Main {


    static void main(String[] args) {

        PuedeVolar[] volar = new PuedeVolar[2];

        volar[0] = new Avion();
        volar[1] = new Pajaro();

        for (PuedeVolar a : volar) {
            a.volar();
        }

    }
}
