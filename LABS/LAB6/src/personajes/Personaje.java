package personajes;

public abstract class Personaje {

    public enum Tipo {
        Arquero,
        Dragon,
        Guerrero,
        Mago
    }

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Personaje() {
    }

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "\nPersonaje: " + nombre
                + "\nNivel: " + nivel
                + "\nPuntos de Vida: " + puntosVida + '\n';
    }

    public void recibirDanio(int danio) {
        System.out.printf("%s recibe %d puntos de danio\n", this.nombre, danio);
        this.puntosVida -= danio;
        System.out.println("Puntos de vida actuales: " + this.puntosVida);
        System.out.println("Sigue vivo?: " + this.estaVivo());

    }

    public boolean estaVivo() {
        return this.puntosVida > 0;
    }

    public abstract String atacar();

}
