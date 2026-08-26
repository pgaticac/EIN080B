package main;

import clases.Dueño;
import clases.Vehiculo;

public class Main {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Vehiculo v2 = new Vehiculo("Mazda", "3", "CCBB22");

        Dueño d = new Dueño();
        d.setNombre("Antonio Stark");

        v.setPatente("JJJJ11");
        v.setMarca("Kia");
        v.setModelo("Rio");
        v.setDueño(d);
        
        v2.setDueño(d);

        System.out.println(v);
        System.out.println(v2);
    }

}
