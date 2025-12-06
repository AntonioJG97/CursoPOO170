package com.mx.curso.unidad3.practica2;

import java.util.Scanner;

public class LectorHistorialPaciente {

    public static boolean validarIDPaciente(int id) {

        // Si el número está entre 10000 y 99999, tiene 5 dígitos
        if (id >= 10000 && id <= 99999) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idPaciente;

        System.out.println("=== Acceso a Historial de Paciente ===");


        do {
            System.out.print("Ingresa el ID del paciente (5 dígitos): ");
            idPaciente = sc.nextInt();


            if (!validarIDPaciente(idPaciente)) {
                System.out.println("ID inválido. Intenta de nuevo.");
            }

        } while (!validarIDPaciente(idPaciente)); // repetir si es falso

        System.out.println("ID válido. Acceso permitido al historial.");
        sc.close();
    }
}

