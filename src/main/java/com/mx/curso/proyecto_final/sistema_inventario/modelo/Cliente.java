package com.mx.curso.proyecto_final.sistema_inventario.modelo;

public class Cliente extends EntidadComercial {

   private String telefono;

    public Cliente(String id, String nombre, String telefono) {
        super(id, nombre);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if(telefono != null){
            this.telefono = telefono;
        }
    }

    @Override
    public String toString() {
        return "Cliente{id='" + getId() + "', nombre='" + getNombre() + "', telefono='" + telefono + "'}";
    }

}
