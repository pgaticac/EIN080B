package personajes;

import personajes.habilidades.Magico;
import personajes.habilidades.Volador;

public class Dragon extends Personaje implements Magico, Volador {

    private int dañoFuego;

    public Dragon() {
    }

    public Dragon(int dañoFuego, String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.dañoFuego = dañoFuego;
    }

    public int getDañoFuego() {
        return dañoFuego;
    }

    public void setDañoFuego(int dañoFuego) {
        this.dañoFuego = dañoFuego;
    }

    @Override
    public String atacar() {
        return super.nombre + " ataca con fuego";
    }

    @Override
    public void lanzarHechizo() {
        System.out.printf("%s lanza un hechizo ancestral\n", super.nombre);
    }

    @Override
    public void volar() {
        System.out.printf("%s vuela por los cielos\n", super.nombre);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Tipo: Dragon\n"
                + "Danio de fuego: " + this.dañoFuego + "\n";
    }

}
