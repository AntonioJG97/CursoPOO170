package com.mx.curso.unidad3.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {

    static void main(String[] args) {
        //declaracion de variables
        int codigo = 0;
        String nombre = "";
        int cantidad = 0;
        double precio = 0.0;
        String categoria = "";

        Scanner scanner = new Scanner(System.in); //se inicializa el scanner para leer lo que el usuario ingrese.
        try{
            System.out.println("Ingrese el nombre del producto");
            nombre = scanner.nextLine();
            System.out.println("Ingrese cantidad en stock");
            cantidad = scanner.nextInt();
            System.out.println("Ingrese el precio unitario");
            precio = scanner.nextDouble();

            if(cantidad>0){  //para validar que la cantidad sea mayor que 0 y entre al siguiente if.
                if (precio>0) { //Validamos que el precio sea positivo.
                    System.out.println("¡Producto registrado con éxito!");

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio: " + precio);
                }else{ //muestra mensaje si ingresan un numero negativo
                    System.out.println("Error: el precio debe ser positivo");
                }
            }else{ //mensaje si se ingresa cantidad menor que cero
                System.out.println("Error: La cantidad debe ser mayor que 0");
            }


        }catch (InputMismatchException e){ // si el usuario ingresa texto en campos especificos de numeros, mandara esta excepcion
            System.out.println("Error: debes ingresar solo números en cantidad y precio." + e.getMessage()); //mensaje de error si el usuario ingresa texto en lugar de numeros
        }finally {
            scanner.close();
        }


    }


}
