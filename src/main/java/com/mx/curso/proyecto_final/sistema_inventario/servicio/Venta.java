package com.mx.curso.proyecto_final.sistema_inventario.servicio;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Cliente;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Producto;
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
    public Venta(String idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.fechaHora = LocalDateTime.now();
        this.cliente = cliente;
        this.articulosVendidos = new ArrayList<>();
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

    public void agregarLinea(Producto producto, int cantidadVendida) {
        if (producto == null || cantidadVendida <= 0) {
            System.out.println("No se puede agregar una línea de venta con datos inválidos.");
            return;
        }
        LineaVenta linea = new LineaVenta(cantidadVendida, producto.getPrecioVenta(), producto);
        articulosVendidos.add(linea);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (LineaVenta linea : articulosVendidos) {
            total += linea.subTotal();
        }
        return total;
    }

    public double calSub() {
        double stotal = 0.0;
        for (LineaVenta lvs : articulosVendidos) {
            stotal += lvs.subTotal();
        }
        return stotal;
    }

    public void generarFactura(){
        System.out.println("FACTURA");
        System.out.println("Venta ID: "+idVenta);
        System.out.println("Fecha y hora: "+fechaHora);
        System.out.println("Cliente: "+cliente.getNombre());
        System.out.println("Produsctos");
        for (LineaVenta lineav: articulosVendidos){
            System.out.println(lineav);
        }
        System.out.println("Subtotal: "+calSub() );
        System.out.println("Total: "+calcularTotal());


    }

}
