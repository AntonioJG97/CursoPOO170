package com.mx.curso.unidad3.practicas;

import java.util.Scanner;

public class Actividad5 {

    static void main(String[] args) {

        String usuario = "";
        String pass = "";
        boolean autenticado = false;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0;i< 3;i++){
            System.out.println("Ingrese su usuario");
            usuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña");
            pass = scanner.nextLine();

            if(usuario.equals("admin")){
                if(pass.equals("admin")){
                    System.out.println("Autenticacion exitosa!");
                    autenticado = true;
                    break;
                }else{
                    System.out.println("Contraseña incorrecta!");
                }
            }else{
                System.out.println("Usuario incorrecto");
            }

        }
        if(autenticado!=true){
            System.out.println("Demasiados intentos: Acceso denegado");
        }

    }


}
