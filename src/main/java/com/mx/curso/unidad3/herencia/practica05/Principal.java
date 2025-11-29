package com.mx.curso.unidad3.herencia.practica05;

public class Principal {
    static void main(String[] args) {
        Articulo tornillo = new Articulo("TORNILLO-123");
        RegistroInventario registro = new RegistroInventario("Carlos");
        registro.registrarMovimiento(tornillo,100);
        registro.registrarMovimiento(tornillo,10,"NORMAL");
        System.out.println(tornillo.getCantidadStock());


    }
}
