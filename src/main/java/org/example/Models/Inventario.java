package org.example.Models;
import java.util.ArrayList;

public class Inventario {
    private String producto;
    private int cantidad;
    public Inventario(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Inventario() {
    }
    @Override
    public String toString() {
        return "Inventario [producto=" + producto + ", cantidad=" + cantidad + "]";
    }
}
