package com.mx.curso.proyecto_final.sistema_inventario.controlador;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Cliente;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Producto;
import com.mx.curso.proyecto_final.sistema_inventario.modelo.Proveedor;
import com.mx.curso.proyecto_final.sistema_inventario.servicio.InventarioService;
import com.mx.curso.proyecto_final.sistema_inventario.servicio.Venta;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaInventario {

    static void main(String[] args) {
        InventarioService inventario= new InventarioService();
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
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;

                        }

                    }while(opc!=0);

                case 2:

                    int opc1;
                    do{
                        System.out.println("CLIENTES");
                        System.out.println("1.- Registrar");
                        System.out.println("0.- regresar al menu principal");
                        System.out.println("Elige una opcion");
                        opc1 = Integer.parseInt(scanner.nextLine());

                        switch(opc1){
                            case 1:
                                System.out.println("Ingresa el ID del cliente");
                                String idcliente = scanner.nextLine();
                                System.out.println("Ingresa el mombre");
                                String nomCliente = scanner.nextLine();
                                System.out.println("Ingrese el telefono");
                                String telCliente = scanner.nextLine();
                                Cliente cliente = new Cliente(idcliente,nomCliente,telCliente);
                                inventario.registrarCliente(cliente);
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                break;

                        }

                    }while(opc1!=0);

                case 3:
                    int opc2;
                    do{
                        System.out.println("PROVEEDORES");
                        System.out.println("1.- Registrar");
                        System.out.println("2.- Buscar productos asociados al proveedor");
                        System.out.println("0.- regresar al menu principal");
                        System.out.println("Elige una opcion");
                        opc2 = Integer.parseInt(scanner.nextLine());

                        switch(opc2){
                            case 1:
                                System.out.println("Ingresa el ID del proveedor");
                                String idProveedor = scanner.nextLine();
                                System.out.println("Ingresa el mombre");
                                String nomProveedor = scanner.nextLine();
                                System.out.println("Ingrese el contacto del proveedor");
                                String contacto = scanner.nextLine();
                                Proveedor proveedor = new Proveedor(idProveedor,nomProveedor,contacto);
                                inventario.registrarProveedor(proveedor);
                                break;

                            case 2:
                                System.out.println("Ingresa ID del proveedor");
                                String idProve = scanner.nextLine();
                                inventario.buscarProductosxProveedor(idProve);

                            default:
                                System.out.println("Opcion invalida");
                                break;

                        }

                    }while(opc2!=0);

                case 4:

                    int opc3;
                    do{
                        System.out.println("VENTAS");
                        System.out.println("1.- Registrar Venta");
                        System.out.println("0.- regresar al menu principal");
                        System.out.println("Elige una opcion");
                        opc3 = Integer.parseInt(scanner.nextLine());

                        switch(opc3){
                            case 1:
                                System.out.println("Ingresa el ID de la venta:");
                                String idVenta = scanner.nextLine();

                                System.out.println("Ingresa el ID del cliente:");
                                String idCliente = scanner.nextLine();
                                Cliente cliente = null;
                                if (!idCliente.isBlank()) {
                                    cliente = inventario.buscarCliente(idCliente);
                                    if (cliente == null) {
                                        System.out.println("Cliente no encontrado. La venta será a CONTADO.");
                                    }
                                }

                                System.out.println("Ingrese el ID del producto vendido:");
                                String idProducto = scanner.nextLine();
                                Producto productoEncontrado = inventario.buscarProducto(idProducto);
                                if (productoEncontrado == null) {
                                    System.out.println("ERROR: Producto no encontrado.");
                                    break;
                                }

                                System.out.println("Ingresa la cantidad:");
                                int cantidadVen = Integer.parseInt(scanner.nextLine());
                                if (cantidadVen > productoEncontrado.getCantidadStock()) {
                                    System.out.println("ERROR: Stock insuficiente. Stock actual: " + productoEncontrado.getCantidadStock());
                                    break;
                                }
                                // Crear la venta y registrar
                                Venta venta = new Venta(idVenta, cliente);
                                venta.agregarLinea(productoEncontrado, cantidadVen);
                                productoEncontrado.disminuirStock(cantidadVen);
                                inventario.registrarVenta(venta);
                                venta.generarFactura();
                                System.out.println("Venta registrada correctamente.");


                            default:
                                System.out.println("Opcion invalida");
                                break;

                        }

                    }while(opc3!=0);


            }


        }while(opcion!=0);
    }



}
