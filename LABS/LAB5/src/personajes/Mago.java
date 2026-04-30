package personajes;

import personajes.habilidades.Magico;
import personajes.habilidades.Curable;

public class Mago extends Personaje implements Magico, Curable {

    private int poderMagico;

    public Mago() {
    }

    public Mago(int poderMagico, String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public void atacar() {
        System.out.printf("%s lanza un ataque magico\n", super.nombre);
    }

    @Override
    public void lanzarHechizo() {
        System.out.printf("%s lanza un hechizo\n", super.nombre);
    }

    @Override
    public void curar() {
        System.out.printf("%s cura a un aliado\n", super.nombre);
    }
    @Override
    public String toString() {
        return super.toString()
                + "Tipo: Mago\n"
                + "Poder Magico: " + this.poderMagico+"\n";
    }
}
