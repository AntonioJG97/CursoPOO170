package com.mx.curso.unidad3.practicas;

import java.util.Scanner;

public class Actividad4 {

    static void main(String[] args) {
    String email = "";
    Scanner scanner = new Scanner(System.in);



    do{
        System.out.println("Ingrese su correo electronico");
        email = scanner.nextLine();
        if(!validarEmail(email)){
            System.out.println("Ingrese un correo valido");
        }

    }while(!validarEmail(email));

        System.out.println("Correo registrado correctamente");
        scanner.close();

    }

    public static boolean validarEmail(String email){
        if (email.contains("@")){
            return true;
        }else{
            return false;
        }

    }

}
