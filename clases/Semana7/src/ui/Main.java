package ui;

import clases.LineaArea;
import clases.Pasajero;
import clases.Pasaje;

public class Main {

    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("12345678-9", "Bruno Diaz", 45, 99887766);
        Pasajero p2 = new Pasajero("234566789-0", "Antonio Stark", 40, 88776655);
        Pasajero p3 = new Pasajero("1122334455-0", "Pedro Parker", 20, 77665544);

        Pasaje pasaje1 = new Pasaje();
        pasaje1.setNumeroAsiento(1);
        pasaje1.setTipoServicio("Almuerzo");
        pasaje1.setPasajero(p1);

        Pasaje pasaje2 = new Pasaje();
        pasaje2.setNumeroAsiento(2);
        pasaje2.setTipoServicio("Almuerzo");
        pasaje2.setPasajero(p2);

        Pasaje pasaje3 = new Pasaje();
        pasaje3.setNumeroAsiento(3);
        pasaje3.setTipoServicio("Almuerzo");
        pasaje3.setPasajero(p3);

        LineaArea tam = new LineaArea();
        tam.agregarPasaje(pasaje1);
        tam.agregarPasaje(pasaje2);
        tam.agregarPasaje(pasaje3);
        
        System.out.println(tam.listarPasajes());
        
        System.out.println("Total Pasajes: " + tam.obtenerPasajesVendidos());

    }

}
