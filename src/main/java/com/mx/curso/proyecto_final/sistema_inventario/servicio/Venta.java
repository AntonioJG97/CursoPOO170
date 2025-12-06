package com.mx.curso.proyecto_final.sistema_inventario.servicio;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Cliente;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

    private final String idVenta;
    private LocalDateTime fechaHora;
    private Cliente cliente;
    private ArrayList<LineaVenta> articulosVendidos;
    private double total;
    private double impuesto;

    public Venta(String idVenta, LocalDateTime fechaHora, Cliente cliente, ArrayList<LineaVenta> articulosVendidos, double total, double impuesto) {
        this.idVenta = idVenta;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.articulosVendidos = articulosVendidos;
        this.total = total;
        this.impuesto = impuesto;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaVenta> getLinea() {
        return articulosVendidos;
    }

    public void setLinea(ArrayList<LineaVenta> linea) {
        this.articulosVendidos = linea;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double total(){


    }

    public void generarFactura(){



    }

}
