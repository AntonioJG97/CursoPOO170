package com.mx.curso.proyecto_final.sistema_de_inventario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaInventario {

    static void main(String[] args) {
        SistemaInventario inventario= new SistemaInventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Sistema de Gestio de Inventario");
            System.out.println("Menu de opciones");
            System.out.println("1.-Productos");
            System.out.println("2.-Clientes");
            System.out.println("3.-Proveedores");
            System.out.println("0.-Salir del programa");
            System.out.println("Elige una opcion");
            opcion = Integer.parseInt(scanner.nextLine());

            switch(opcion){
                case 1:
                    int opc;
                    do{
                        System.out.println("PRODUCTOS");
                        System.out.println("1.- Registrar");
                        System.out.println("2.- Actualizar");
                        System.out.println("3.- Busqueda x ID");
                        System.out.println("0.- regresar al menu principal");
                        System.out.println("Elige una opcion");
                        opc = Integer.parseInt(scanner.nextLine());

                        switch(opc){
                            case 1:
                                System.out.print("ID Producto: ");
                                String idProd = scanner.nextLine();
                                System.out.print("Nombre: ");
                                String nomProd = scanner.nextLine();
                                System.out.print("Precio venta: ");
                                double precio = Double.parseDouble(scanner.nextLine());
                                System.out.print("Costo compra: ");
                                double costo = Double.parseDouble(scanner.nextLine());
                                System.out.print("Cantidad en stock: ");
                                int stock = Integer.parseInt(scanner.nextLine());
                                System.out.print("Umbral mínimo: ");
                                int umbral = Integer.parseInt(scanner.nextLine());
                                System.out.print("ID Proveedor: ");
                                String idProvProd = scanner.nextLine();
                                Proveedor provAsoc = null;
                                if (!idProvProd.isBlank()) {
                                    provAsoc = inventario.buscarProveedor(idProvProd);
                                    if (provAsoc == null) {
                                        System.out.println("Proveedor no encontrado, se guarda sin proveedor.");
                                    }
                                }
                                Producto prod = new Producto(idProd, nomProd, precio, costo, stock, umbral, provAsoc);
                                inventario.registrarProducto(prod);
                                break;

                            case 2:
                                System.out.println("id del producto a actualizar");
                                String idPro = scanner.nextLine();
                                Producto encontrar = inventario.buscarProducto(idPro);
                                if(encontrar != null){
                                    System.out.println("Ingrese el precio nuevo");
                                    double precioNuevo = Double.parseDouble(scanner.nextLine());
                                    System.out.println("Ingrese el nuevo stock");
                                    int stockNuevo = Integer.parseInt(scanner.nextLine());
                                    inventario.actualizarProducto(idPro,precioNuevo,stockNuevo);
                                }else{
                                    System.out.println("Sin resultados");
                                }
                                break;

                            case 3:
                                System.out.println("Ingrese el ID del producto");
                                String idProB = scanner.nextLine();
                                Producto busquedaProducto = inventario.buscarProducto(idProB);
                                if(busquedaProducto != null){
                                    System.out.println(busquedaProducto);
                                }else{
                                    System.out.println("Sin resultados");
                                }


                        }

                    }while(opc!=0);
                    System.out.println();
            }


        }while(opcion!=0);
    }

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<Venta> Ventas = new ArrayList<>();


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
            if(cliente.getId().equals(c.id)){
                System.out.println("Este cliente ya existe");
                return false;
            }
        }
        clientes.add(c);
        return true;
    }

}
