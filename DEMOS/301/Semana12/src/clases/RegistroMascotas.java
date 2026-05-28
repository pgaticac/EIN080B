
package clases;

import java.util.ArrayList;

public class RegistroMascotas {
    public static ArrayList<Mascota> mascotas = new ArrayList<>();
    
    public static void add(Mascota m){
        mascotas.add(m);
    }

    @Override
    public String toString() {
        return "RegistroMascotas{" + "mascotas=" + mascotas + '}';
    }
    
    
}
