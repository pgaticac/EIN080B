package main;

import personajes.Arquero;
import personajes.Dragon;
import personajes.Guerrero;
import personajes.Mago;

public class Main {

    public static void main(String[] args) {

        Guerrero arthas = new Guerrero(40, "Arthas", 8, 120);
        Mago merlin = new Mago(85, "Merlin", 10, 90);
        Arquero legolas = new Arquero(95, "Legolas", 7, 100);
        Dragon smaug = new Dragon(150, "Smaug", 20, 300);

        System.out.println("=== PERSONAJES CREADOS ===");

        System.out.println(arthas);
        arthas.atacar();

        System.out.println(merlin);
        merlin.atacar();
        merlin.lanzarHechizo();
        merlin.curar();

        System.out.println(legolas);
        legolas.atacar();

        System.out.println(smaug);
        smaug.atacar();
        smaug.lanzarHechizo();
        smaug.volar();

        System.out.println("\n=== PRUEBA DE DANIO ===\n");
        smaug.recibirDanio(80);
    }

}
