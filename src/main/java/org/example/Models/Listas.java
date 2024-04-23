package org.example.Models;

import java.util.ArrayList;

public class Listas {
    private ArrayList<Inventario> listI = new ArrayList<Inventario>();
    private ArrayList <Cajas> listC = new ArrayList<Cajas>();
    private ArrayList<Productos> listP = new ArrayList<Productos>();
    private ArrayList<Ventas> listV = new ArrayList<>();

    public ArrayList<Inventario> getListI() {
        return listI;
    }

    public void setListI(ArrayList<Inventario> listI) {
        this.listI = listI;
    }

    public ArrayList<Cajas> getListC() {
        return listC;
    }

    public void setListC(ArrayList<Cajas> listC) {
        this.listC = listC;
    }

    public ArrayList<Productos> getListP() {
        return listP;
    }

    public void setListP(ArrayList<Productos> listP) {
        this.listP = listP;
    }

    public ArrayList<Ventas> getListV() {
        return listV;
    }

    public void setListV(ArrayList<Ventas> listV) {
        this.listV = listV;
    }
}
