package com.mx.curso.unidad3.herencia.practica03;

public class CalculadoraGeometrica {

    private String nombreFigura;
    public static double pi = 3.14159;

    public CalculadoraGeometrica() {
        this.nombreFigura = "Desconocida";
    }

    public CalculadoraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }
    //sobrecarga de metodos - mismo metodos, diferentes atributos
    public double calcularArea(double radio){
        return pi * radio * radio;
    }
    public double calcularArea(double ancho, double alto){
        return ancho * alto;
    }

    public double calcularArea(double base, int altura){
        return (base * altura)/2;
    }

    static void main(String[] args) {
        CalculadoraGeometrica cal1 = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo: "+cal1.calcularArea(5.2));
        System.out.println("Area del rectangulo: "+cal1.calcularArea(10.2,5.7));
        System.out.println("Area del triangulo: "+cal1.calcularArea(5.3,6));
        System.out.println("************************************");

        System.out.println("Nueva instancia");
        CalculadoraGeometrica cal2 = new CalculadoraGeometrica("Secundaria");
        System.out.println("Area del circulo: "+cal2.calcularArea(10.0));
        System.out.println("Area del rectangulo: "+cal2.calcularArea(25,10));
        System.out.println("Area del triangulo: "+cal2.calcularArea(15,9));

    }

}
