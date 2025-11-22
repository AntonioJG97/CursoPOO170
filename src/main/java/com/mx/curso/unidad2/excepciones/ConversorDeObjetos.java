package com.mx.curso.unidad2.excepciones;

public class ConversorDeObjetos {
    static void main(String[] args) {

        Object palabra = "Hola";

        try{

            Integer numero = (Integer) palabra;


        } catch (ClassCastException e) {
            System.out.println("No es posible convertir un tipo "+
                    "de objeto al tipo deseado" +e.getMessage());
        }

    }
}
