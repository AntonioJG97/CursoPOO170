package com.mx.curso.unidad3.practica2;

import java.util.Scanner;

public class SistemaAccesoPersonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ciclo de 3 intentos máximo
        for (int i = 1; i <= 3; i++) {
            System.out.println("Intento " + i + " de 3");

            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = sc.nextLine();

            if (usuario.equals("medico1") && contraseña.equals("doc123")) {
                System.out.println("Acceso de Médico exitoso.");
                break;
            }
            else if (usuario.equals("enfermera2") && contraseña.equals("enf456")) {
                System.out.println("Acceso de Enfermera exitoso.");
                break;
            }
            else {
                System.out.println("Credenciales incorrectas. Intenta nuevamente.\n");
                continue;
            }
        }

        // Revisar si se agotaron los intentos
        System.out.println("Fin del proceso de autenticación.");

        sc.close();
    }
}
