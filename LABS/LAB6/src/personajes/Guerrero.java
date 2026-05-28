package personajes;

public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero() {
    }

    public Guerrero(int fuerza, String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String atacar() {
        return super.nombre + " ataca con espada";
    }

    @Override
    public String toString() {
        return super.toString()
                + "Tipo: Guerrero\n"
                + "Fuerza: " + this.fuerza + "\n";
    }

}
