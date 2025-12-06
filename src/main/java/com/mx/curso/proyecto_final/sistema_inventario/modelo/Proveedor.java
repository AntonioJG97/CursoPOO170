package com.mx.curso.proyecto_final.sistema_inventario.modelo;

public class Proveedor extends EntidadComercial {

    private String contacto;

    public Proveedor(String id, String nombre, String contacto) {
        super(id, nombre);
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        if(contacto != null){
            this.contacto = contacto;
        }

    }

    @Override
    public String toString() {
        return "Proveedor{id='" + getId() + "', nombre='" + getNombre() + "', contacto='" + contacto + "'}";
    }

}

