package com.mx.curso.proyecto_final.sistema_inventario.modelo;

public class Producto {

   private final String id;
   private String nombre;
   private double precioVenta;
   private double costoCompra;
   private int cantidadStock;
   private int umbralMinimo;
   private Proveedor proveedor;

    public Producto(String id, String nombre, double precioVenta, double costoCompra, int cantidadStock, int umbralMinimo, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoCompra = costoCompra;
        this.cantidadStock = cantidadStock;
        this.umbralMinimo = umbralMinimo;
        this.proveedor = proveedor;
    }


    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        if(precioVenta>0){
            this.precioVenta = precioVenta;
        }else{
            System.out.println("Error, ingrese un precio positivo");
        }
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        if (costoCompra > 0){
            this.costoCompra = costoCompra;
        }else{
            System.out.println("Error: Ingrese costo de compra positivo");
        }
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock >= 0){
            this.cantidadStock = cantidadStock;
        }else{
            System.out.println("La cantidad en stock no debe ser negativa");
        }
    }

    public int getUmbralMinimo() {
        return umbralMinimo;
    }

    public void setUmbralMinimo(int umbralMinimo) {
        if (umbralMinimo > 0){
            this.umbralMinimo = umbralMinimo;
        }
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void agregarStock(int cantidad){
        if (cantidad > 0) {
            this.cantidadStock = cantidadStock + cantidad;
        }else{
            System.out.println("cantidad debe ser mayor a cero");
        }
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad <= 0) return false;
        if (cantidad > this.cantidadStock) {
            System.out.println("No hay stock suficiente del producto: " + nombre);
            return false;
        }
        this.cantidadStock -= cantidad;
        return true;
    }

    public boolean estaBajoStock() {
        return cantidadStock < umbralMinimo;
    }


    @Override
    public String toString() {
        return "Producto: id='" + id + "', nombre='" + nombre + "', precioVenta=" + precioVenta + ", stock=" + cantidadStock +
                ", proveedor=" + (proveedor != null ? proveedor.getNombre() : "N/A");
    }


}
