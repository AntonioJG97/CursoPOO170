package com.mx.curso.unidad2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Ingresa la primera nota");
                nota1 = scanner.nextDouble();
            System.out.println("Ingresa la segunda nota");
                nota2 = scanner.nextDouble();
                double promedio = (nota1+nota2)/2;
            System.out.println("El promedio es: " + promedio);
        }catch (InputMismatchException e){
            System.out.println("ERROR: "+
                    "Debe de ingresar un numero valido para las notas. "+e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
