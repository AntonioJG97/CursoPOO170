package com.mx.curso.unidad3.herencia.practica05;

public class RegistroInventario {

    private String nombreEncargado;

    public RegistroInventario(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public void registrarMovimiento(Articulo articulo, int cantidad){
        System.out.println("Ingreso de "+cantidad+" ARTICULOS");
        int stock = articulo.getCantidadStock()+cantidad;
        articulo.setCantidadStock(stock);

    }

    public void registrarMovimiento(Articulo articulo, int cantidad, String prioridad){

        System.out.println("Salida registrada de " + cantidad + " unidades del artículo " + articulo.getCodigo() + " con prioridad: " + prioridad);
        int stock = articulo.getCantidadStock() - cantidad;
        articulo.setCantidadStock(stock);

    }

    private void registrarLogistica(String codigoProducto, int movimientos){
        System.out.println("Registrando logistica para: "+codigoProducto+" moviemientos: "+movimientos);
    }

}
