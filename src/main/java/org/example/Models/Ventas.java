package org.example.Models;

import java.util.ArrayList;

public class Ventas {
    private String cantidad;
    private double precio;
    private ArrayList<Ventas> listV = new ArrayList<>();
    public Ventas(String cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public ArrayList<Ventas> getListV() {
        return listV;
    }
    public void setListV(ArrayList<Ventas> listV) {
        this.listV = listV;
    }
    public Ventas() {
    }
    @Override
    public String toString() {
        return "Ventas [cantidad=" + cantidad + ", precio=" + precio + "]";
    }
}

