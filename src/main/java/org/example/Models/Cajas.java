package org.example.Models;
import java.util.ArrayList;

public class Cajas {
    private int num;
    private boolean abierto;
    private ArrayList <Cajas> listC = new ArrayList<Cajas>();
    public Cajas(int num, boolean abierto) {
        this.num = num;
        this.abierto = abierto;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public boolean isAbierto() {
        return abierto;
    }
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    public ArrayList<Cajas> getListC() {
        return listC;
    }
    public void setListC(ArrayList<Cajas> listC) {
        this.listC = listC;
    }
    public Cajas() {
    }

}
