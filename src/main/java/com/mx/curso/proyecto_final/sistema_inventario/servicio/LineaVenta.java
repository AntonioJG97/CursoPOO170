package com.mx.curso.proyecto_final.sistema_inventario.servicio;

import com.mx.curso.proyecto_final.sistema_inventario.modelo.Producto;

public class LineaVenta {

   private int cantidadVendida;
   private double precioUnitario;
   private Producto producto;

    public LineaVenta(int cantidadVendida, double precioUnitario, Producto producto) {
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double subTotal(){  //Metodo para calcular el subtotal de la venta
        return precioUnitario*cantidadVendida;
    }
}
