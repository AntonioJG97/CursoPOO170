package com.mx.curso.proyecto_final.sistema_de_inventario;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

    private final String idVenta;
    private LocalDateTime fechaHora;
    private Cliente cliente;
    private ArrayList<LineaVenta> linea;
    private double total;
    private double impuesto;

    public Venta(String idVenta, LocalDateTime fechaHora, Cliente cliente, ArrayList<LineaVenta> linea, double total, double impuesto) {
        this.idVenta = idVenta;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.linea = linea;
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
        return linea;
    }

    public void setLinea(ArrayList<LineaVenta> linea) {
        this.linea = linea;
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
}
