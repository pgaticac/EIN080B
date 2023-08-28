package listas;

import java.util.ArrayList;

public class Main {
    //psvm
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        
        colores.add(0, "Blanco");
        
        System.out.println(colores);
        
        for (String color : colores) {
            System.out.println(color + " tiene " + color.length()+ " letras y comienza con " + color.charAt(0));
        }
        
        colores.remove("Azul");
        
        System.out.println(colores);
    }
}
