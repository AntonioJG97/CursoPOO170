package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class AccesoLista {

    static void main(String[] args) {

        String [] nombres = {"Antonio","Giovanny","Dalia"};
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Ingrese posicion del arreglo");
            int posicion = scanner.nextInt();
            System.out.println("El nombre asignado es: "+nombres[posicion]);

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Error: La posicion no existe en la lista"+e.getMessage());
        }finally {
            scanner.close();
        }

    }
}
