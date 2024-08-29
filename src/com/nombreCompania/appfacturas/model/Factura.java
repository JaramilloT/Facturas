package com.nombreCompania.appfacturas.model;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;


    int indiceActual = 0;
    private static final int MAX_ITEMS = 10;
    private static int ultimoFolio = 0;

    public Factura (String descripcion, Cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];

        ultimoFolio++;
        this.folio = ultimoFolio;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ItemFactura[] getItems() {
        return items;
    }
    public int getIndiceActual() {
        return indiceActual;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setItems(ItemFactura[] items) {
        this.items = items;
    }
    public void setIndiceActual(int indiceActual) {
        this.indiceActual = indiceActual;
    }
    

    public void agregarItem(ItemFactura item) {
        if (indiceActual < MAX_ITEMS) {
            items[indiceActual] = item;
            indiceActual++;
        } else {
            System.out.println("No se pueden agregar más ítems. Se alcanzó el máximo permitido.");
        }
    }
}
