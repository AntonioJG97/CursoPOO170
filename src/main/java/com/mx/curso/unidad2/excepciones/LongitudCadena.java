package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class LongitudCadena {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;

        try{
            System.out.println("Ingrese una palabra");
            palabra = scanner.nextLine();
            if(palabra.equals("null")){
                palabra=null;
            }
            System.out.println("Longitud de la palabra: "+palabra.length());

        } catch (NullPointerException e) {
            System.out.println("Error: la palabra es nula");
        }finally {
            scanner.close();
        }
    }

}
