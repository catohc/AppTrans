package org.example;
import org.example.Models.Cajas;
import org.example.Models.Inventario;
import org.example.Models.Productos;
import org.example.Models.Ventas;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            boolean ban = true;
            Cajas cajas = new Cajas();
            Inventario inv = new Inventario();
            Productos prod = new Productos();
            Ventas ventas = new Ventas();
            do {
                System.out.println("1.- Iniciar como caja");
                System.out.println("2.- Iniciar como Administrador");
                System.out.println("3.- Salir");
                String option = keyboard.next();
                switch (option) {
                    case "1":
                        if (!cajas.getListC().isEmpty()) {
                            boolean ban2 = true;
                            do {
                                System.out.println("Caja");
                                System.out.println("1.- Alta de productos");
                                System.out.println("2.- Registrar venta");
                                System.out.println("3.- ver inventario");
                                System.out.println("4.- Salir");
                                String option4 = keyboard.next();
                                switch (option4) {
                                    case "1":
                                        boolean ban3 = true;
                                        do {
                                            System.out.println("Ingrese el nombre del articulo: ");
                                            String nombre = keyboard.next();
                                            System.out.println("Ingrese el cantidad del articulo: ");
                                            int cantidad = keyboard.nextInt();
                                            System.out.println("Ingrese el cantidad del articulo: ");
                                            double precio = keyboard.nextDouble();
                                            Productos productos = new Productos(nombre, precio);
                                            Inventario inventario = new Inventario(nombre, cantidad);
                                            if (!inv.getListI().contains(inventario) || !prod.getListP().contains(productos)) {
                                                inv.getListI().add(inventario);
                                                prod.getListP().add(productos);
                                            }else{System.out.println("Este articulo ya existe");}
                                            System.out.println("Quiere agregar otro?");
                                            String option3 = keyboard.next();
                                            if (!option3.equals("s")) {
                                                ban3 = false;
                                            }
                                        } while (ban3);
                                        break;
                                    case "2":
                                        boolean ban4 = true;
                                        do {
                                            System.out.println("Ingrese el nombre del articulo a vender");
                                            String nombrev = keyboard.next();
                                            System.out.println("Ingrese el cantidad a vender");
                                            int cantidadv = keyboard.nextInt();
                                            for (Productos ver : prod.getListP()) {
                                                if (ver.getNombre().equals(nombrev)) {
                                                    for (Inventario item : inv.getListI()) {
                                                        if (item.getProducto().equals(nombrev)) {
                                                            int cantres = item.getCantidad();
                                                            cantres = cantres - cantidadv;
                                                            item.setCantidad(cantres);
                                                            double venderp = ver.getPrecio();
                                                            venderp = venderp * cantidadv;
                                                            Ventas venta = new Ventas(nombrev, venderp);
                                                            ventas.getListV().add(venta);
                                                            System.out.println("Venta exitosa");
                                                        }
                                                    }
                                                }
                                            }System.out.println("Desea ingresar otro?");
                                            String option5 = keyboard.next();
                                            if (!option5.equals("s")) {
                                                ban4 = false;
                                            }
                                        } while (ban4);
                                        break;
                                    case "3":
                                        for (Inventario items : inv.getListI()) {
                                            System.out.println(items.toString());
                                        }
                                        break;
                                    case "4":
                                        ban2 = false;
                                        break;

                                    default:
                                        break;
                                }
                            } while (ban2);
                        }
                        break;
                    case "2":
                        boolean ban5 = true;
                        do {
                            System.out.println("Administrador");
                            System.out.println(".............");
                            System.out.println("1.- Arqueo de caja");
                            System.out.println("2.- Apertura de caja");
                            System.out.println("3.- Salir");
                            String option2 = keyboard.next();
                            switch (option2) {
                                case "1":
                                    for (Ventas ven : ventas.getListV()) {
                                        System.out.println(ven.toString());
                                    }
                                    break;
                                case "2":
                                    boolean abrir = true;
                                    do {
                                        System.out.println("Desea abrir una caja?");
                                        String option3 = keyboard.next();
                                        if (option3.equals("s")) {
                                            System.out.println("Ingrese el numero de la caja: ");
                                            int numc = keyboard.nextInt();
                                            boolean abierto = true;
                                            Cajas caja = new Cajas(numc, abierto);
                                            cajas.getListC().add(caja);
                                            abrir = false;
                                        }else{
                                            abrir = false;
                                        }
                                    } while (abrir);
                                    break;
                                case "3":
                                    System.out.println("Saliendo del menu administrador");
                                    ban5 = false;
                                    break;
                                default:
                                    break;
                            }
                        } while (ban5);
                        break;
                    case "3":
                        System.out.println("Saliendo del programa");
                        ban = false;
                        break;
                    default:
                        break;
                }
            } while (ban);
        }
    }
}