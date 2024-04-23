package org.example.Models;

import java.util.ArrayList;

public class Productos {
    private String nombre;
    private double precio;
    private ArrayList<Productos> listP = new ArrayList<Productos>();
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public ArrayList<Productos> getListP() {
        return listP;
    }
    public void setListP(ArrayList<Productos> listP) {
        this.listP = listP;
    }
    public Productos() {
    }

}
