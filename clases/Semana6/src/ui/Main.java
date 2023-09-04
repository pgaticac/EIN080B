package ui;

import clases.Persona;

public class Main {

    public static void main(String[] args) {
        //declaración del objeto    
        Persona p;
        //instanciación (creación/construcción) del objeto
        p = new Persona();
        //Persona p = new Persona();
        
        System.out.println(p.saludar());

        p.setNombre("Bruno");
        p.setApellido("Diaz");
        p.setTelefono("987654321");

        System.out.println(p.saludar());
        
        Persona p1 = new Persona("Antonio","Stark","98746738");
        
        System.out.println(p1.saludar());
    }
}
