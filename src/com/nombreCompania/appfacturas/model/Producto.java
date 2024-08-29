package com.nombreCompania.appfacturas.model;

public class Producto {
    private String codigo;
    private static String nombre;
    private static double precio;

    //Private class ultimo codigo
    private static int ultimoCodigo = 0;

    //Constructor
    public Producto(String nombre, double precio) {
        ultimoCodigo++;
        this.codigo = "P" + String.format("%05d", ultimoCodigo);
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters and setters

    public String getCodigo() {
        return codigo;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Retorna la informacion

    @Override
    public String toString() {
        return codigo + "\n" + nombre + "\n" + precio;
    }
}