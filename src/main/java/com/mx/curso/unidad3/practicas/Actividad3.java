package com.mx.curso.unidad3.practicas;

import java.util.Scanner;

public class Actividad3 {

    static void main(String[] args) {

        String estado = "";
        Scanner scanner = new Scanner(System.in);



        while(!estado.equals("Entregado")){

            System.out.println("Ingrese el estado del pedido");
            estado = scanner.nextLine();

            switch(estado){
                case "Procesando":
                    System.out.println("Procesando pedido");
                    continue;

                case "En camino":
                    System.out.println("el pedido esta en camino");
                    continue;

                case "Error en envio":
                    System.out.println("Proceso detenido, error en el envio!");
                    break;

                case "Entregado":
                    System.out.println("Pedido entregado con exito!");
                    break;

                default:
                    System.out.println("estado no disponible, intente de nuevo");
                    break;
            }

        scanner.close();

        }



    }

}
