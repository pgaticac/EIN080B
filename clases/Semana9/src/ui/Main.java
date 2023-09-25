package ui;

import clases.Animal;
import clases.Gato;
import clases.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal",1);
        System.out.println(animal);
        System.out.println("Animal: " + animal.comunicarse());
      
        
        Gato gato = new Gato();
        gato.setNombre("Cucho");
        System.out.println(gato);
        System.out.println("Gato: " + gato.comunicarse());
        
        Perro perro = new Perro();
        perro.setNombre("Boby");
        System.out.println(perro);
        System.out.println("Perro: " + perro.comunicarse());
        System.out.println("Perro: " + perro.comunicarse(5));
        
        
    }
    
}
