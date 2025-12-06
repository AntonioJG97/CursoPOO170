package com.mx.curso.proyecto_final.sistema_inventario.servicio;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Cliente;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Producto;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Proveedor;

import java.util.ArrayList;

public class InventarioService {

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();


    //PRODUCTOS
    public boolean registrarProducto(Producto p) {
        if(buscarProducto(p.getId()) != null){
            System.out.println("Este producto ya existe");
            return false;
        }
        productos.add(p);
        return true;
    }

    public Producto buscarProducto(String id){
        for(Producto p: productos){
            if(p.getId().equals(id)){
                return p;
            }
        }return null;
    }

    public void actualizarProducto(String id, double nuevoPrecio, int nuevoStock){
        Producto p = buscarProducto(id);
        if(p == null){
            System.out.println("Este producto no existe");
            return;
        }else{
            p.setPrecioVenta(nuevoPrecio);
            p.setCantidadStock(nuevoStock);
            System.out.println("Producto: "+id+ " Actualizado");
        }
    }

    public void alertaStockBajo(){
        for(Producto p: productos){
            if(p.getCantidadStock()< p.getUmbralMinimo()){
                System.out.println("Alerta! Stock del producto: "+p.getNombre()+" BAJO");
                System.out.println("Realizar pedido con proveedor"); //que el sistema me diga el proveedor
            }
        }
    }
    //PROVEEDORES
    public boolean registrarProveedor(Proveedor p) {
        if(buscarProveedor(p.getId()) != null){
            System.out.println("Este producto ya existe");
            return false;
        }
        proveedores.add(p);
        return true;
    }
    public Proveedor buscarProveedor(String id) {
        for (Proveedor p : proveedores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public ArrayList<Producto> buscarProductosxProveedor(String idproveedor){
        ArrayList<Producto> lista = new ArrayList<>();
        for(Producto pro: productos){
            if(pro.getProveedor().getId().equals(idproveedor)){
                lista.add(pro);
            }
        }
        return lista;
    }
    //CLIENTES
    public boolean registrarCliente(Cliente c){
        for(Cliente cliente: clientes){
            if(cliente.getId().equals(c.getId())){
                System.out.println("Este cliente ya existe");
                return false;
            }
        }
        clientes.add(c);
        return true;
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    //VENTAS
    public void registrarVenta(Venta v) {
        ventas.add(v);
    }

    public void vender(String idVenta, String idCliente, String idProducto, int cantidad) {

        Cliente cliente = null;
        if (idCliente != null && !idCliente.isBlank()) {
            cliente = buscarCliente(idCliente);
            if (cliente == null) {
                System.out.println("No se encontró el cliente, la venta será a CONTADO.");
            }
        }

        Producto p = buscarProducto(idProducto);
        if (p == null) {
            System.out.println("ERROR: No se encontró el producto con ID " + idProducto);
            return;
        }
        if (cantidad > p.getCantidadStock()) {
            System.out.println("ERROR: Stock insuficiente para " + p.getNombre());
            return;
        }

        // Crear la venta y la línea de venta
        Venta venta = new Venta(idVenta, cliente);
        p.disminuirStock(cantidad);
        venta.agregarLinea(p, cantidad);

        if (p.getCantidadStock() < p.getUmbralMinimo()) {
            System.out.println("El producto " + p.getNombre() + " está bajo en inventario.");
        }
        registrarVenta(venta);
        venta.generarFactura();
    }



}
