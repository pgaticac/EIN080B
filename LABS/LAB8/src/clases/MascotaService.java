package clases;

import java.util.ArrayList;

public class MascotaService {

    public static ArrayList<Mascota> mascotas = new ArrayList<>();


    public MascotaService() {

    }

    public static boolean registrar(Mascota mascota) {
        mascotas.add(mascota);
        return true;
    }

    public static Mascota buscar(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }
        return null;
    }

    public static ArrayList<Mascota> listar() {
        return mascotas;
    }

}
