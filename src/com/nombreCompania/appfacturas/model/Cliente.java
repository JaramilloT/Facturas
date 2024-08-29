package com.nombreCompania.appfacturas.model;

public class Cliente {
    private String nombre;
    private String  nif;//Numero de identificacion fiscal.

    public Cliente(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }


    //Getter and setters

    public String getNombre() {
        return nombre;
    }
    public String getNif() {
        return nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
}