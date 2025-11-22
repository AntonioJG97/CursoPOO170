package com.mx.curso.unidad2.excepciones;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversorNumerico {
    static void main(String[] args) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingrese texto");
            text = scanner.nextLine();
            int numero = Integer.parseInt(text);
            System.out.println("numero: "+numero);

        }catch (NumberFormatException e){
            System.out.println("Error: el formato no corresponde a un numero " +
                    "entero valido");
        }finally {
            scanner.close();
        }

    }
}
