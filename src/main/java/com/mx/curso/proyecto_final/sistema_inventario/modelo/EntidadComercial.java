package com.mx.curso.proyecto_final.sistema_inventario.modelo;

public abstract class EntidadComercial{

    protected final String id; //final se utiliza para que el id sea unico e inmutable
    protected String nombre;

    public EntidadComercial(String id, String nombre) { //constructor
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null ){  //validacion para que el nombre no pueda ser nulo
            this.nombre = nombre;
        }

    }
}
