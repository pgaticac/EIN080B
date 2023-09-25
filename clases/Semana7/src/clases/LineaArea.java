package clases;

import java.util.ArrayList;

public class LineaArea {

    private ArrayList<Pasaje> pasajes;

    public LineaArea() {
        pasajes = new ArrayList<>();
    }
    
    public boolean agregarPasaje(Pasaje p) {
        pasajes.add(p);
        return true;
    }
    
    public String listarPasajes(){
        String datos = "";
        for (Pasaje pasaje : pasajes) {
            datos += pasaje+"\n"; 
        }
        return datos;
    }
    
    public int obtenerPasajesVendidos(){
        return pasajes.size();
    }
}
