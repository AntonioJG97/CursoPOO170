package com.mx.curso.unidad3.practica2;

import java.util.Scanner;

public class NotificacionResultados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String estado = "";

        System.out.println("Sistema de Notificación de Resultados");

        while (!estado.equalsIgnoreCase("Listo para revisión")) {

            System.out.print("Ingresa el estado actual del análisis: ");
            estado = sc.nextLine();

            switch (estado.toLowerCase()) {

                case "en proceso":
                    System.out.println("El análisis sigue en proceso... continuando monitoreo.");

                    continue;

                case "error en muestra":
                    System.out.println("¡Error crítico! Deteniendo el proceso de notificación.");

                    break;

                case "listo para revisión":
                    System.out.println("El análisis está listo para ser revisado por el médico.");
                    break;

                default:
                    System.out.println("Estado registrado: " + estado + ". Continuando...");
                    break;
            }


            if (estado.equalsIgnoreCase("error en muestra")) {
                break;
            }
        }

        System.out.println("=== Fin del proceso de notificación ===");
        sc.close();
    }
}

