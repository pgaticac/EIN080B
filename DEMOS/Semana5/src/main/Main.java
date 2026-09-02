package main;

import clases.*;
//import clases.Producto;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Producto p = new Producto("P001","Lápiz grafito",100,250);
       Inventario bodega = new Inventario();
       bodega.agregar(p);
    }
    
}
