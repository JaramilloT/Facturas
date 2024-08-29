package com.nombreCompania.appfacturas.model;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    //Constructor

    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters and Setters

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /*Método para calcular el importe de un producto.
      La operación es cantidad * precio que tiene el objeto producto.*/


    public float calcularImporte() {
        return (float) (cantidad * Producto.getPrecio());
    }


    //Retorna la informacion

    @Override
    public String toString() {
        return Producto.getNombre() + "\t" + cantidad + "\t" + calcularImporte();
    }
}