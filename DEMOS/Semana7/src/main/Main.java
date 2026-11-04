
package main;

import clases.Gato;
import clases.Perro;

public class Main{

    public static void main(String[] args) {
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        System.out.println(p1.comunicar(3));
        System.out.println(g1.comunicar());
    }
    
}
