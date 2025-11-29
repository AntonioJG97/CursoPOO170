package com.mx.curso.unidad3.herencia.practica01;

public class ProductoDigital {

    private String nombre;
    private double precio = 0;
    private boolean esDescargable;

    private static int contadorDeProductos = 0;

    public ProductoDigital(String nombre, double precio,boolean esDescargable) {
        this.nombre = nombre;
        this.precio = precio;
        this.esDescargable = esDescargable;
        contadorDeProductos++;
    }

    //obtener el valor de los productos
    public int obtenerTotalProductos(){
        return contadorDeProductos;
    }

    public void setPrecio (double nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }


    public boolean isEsDescargable() {
        return esDescargable;
    }

    public void setEsDescargable(boolean esDescargable) {
        this.esDescargable = esDescargable;
    }

    public static int getContadorDeProductos() {
        return contadorDeProductos;
    }

    public static void setContadorDeProductos(int contadorDeProductos) {
        ProductoDigital.contadorDeProductos = contadorDeProductos;
    }
}
