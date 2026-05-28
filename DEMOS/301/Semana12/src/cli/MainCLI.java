package cli;

import clases.Mascota;
import clases.RegistroMascotas;

public class MainCLI {

    public static void main(String[] args) {
        Mascota m = new Mascota();
//        RegistroMascotas registro = new RegistroMascotas();
        m.setNombre("Dona");
        System.out.println(m);
        RegistroMascotas.add(m);
        System.out.println(RegistroMascotas.mascotas);
    }

}
