package com.mx.curso.unidad3.practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionCita {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 1. Solicitar hora de la cita
            System.out.print("Ingresa la hora de la cita: ");
            int hora = sc.nextInt();  // Aquí puede ocurrir InputMismatchException

            // Consumimos el salto de línea pendiente (buena práctica al mezclar nextInt y nextLine)
            sc.nextLine();

            // 2. Solicitar día de la semana
            System.out.print("Ingresa el día de la semana: ");
            String dia = sc.nextLine().toLowerCase();  // pasamos a minúsculas para comparar más fácil

            // 3. Validaciones con if-else anidados

            // Primero validamos la hora
            if (hora >= 9 && hora <= 17) {
                // Si la hora es válida, ahora validamos el día
                if (!dia.equals("sabado") && !dia.equals("sábado") && !dia.equals("domingo")) {
                    // Ambas condiciones válidas
                    System.out.println("Cita agendada con éxito.");
                } else {
                    // Hora válida pero día de fin de semana
                    System.out.println("Error: No se agendan citas en sábado ni domingo.");
                }
            } else {
                // La hora está fuera del horario permitido
                System.out.println("Error: La hora debe estar entre las 9 y las 17 horas.");
            }

        } catch (InputMismatchException e) {
            // Este bloque se ejecuta si el usuario escribe algo que no es un entero para la hora
            System.out.println("Error: Debes ingresar un número entero válido para la hora de la cita.");
        } finally {
            sc.close(); // Buena práctica: cerrar el Scanner
        }
    }
}
