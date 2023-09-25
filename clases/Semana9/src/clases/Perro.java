package clases;

public class Perro extends Animal {

    @Override
    public String toString() {
        return "Perro{nombre=" + super.getNombre() + " , edad=" + super.edad + " }";
    }

    @Override
    public String comunicarse() {
        return "guau!";
    }
    
    public String comunicarse(int veces){
        String out = "";
        for (int i = 0; i < veces; i++) {
            out+="guau ";
        }
        out+="!";
        return out;
    }
}
