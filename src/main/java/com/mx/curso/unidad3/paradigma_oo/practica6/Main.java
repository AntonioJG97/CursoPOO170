package com.mx.curso.unidad3.paradigma_oo.practica6;

public class Main {

    static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de dos enteros: " + calc.sumar(5, 7));
        System.out.println("Suma de tres enteros: " + calc.sumar(2, 4, 6));
        System.out.println("Suma de dos decimales: " + calc.sumar(3.5, 2.8));
    }

}
