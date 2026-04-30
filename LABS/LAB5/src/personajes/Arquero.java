
package personajes;

public class Arquero extends Personaje {
    private int precision;

    public Arquero() {
    }

    public Arquero(int precision, String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
     @Override
    public void atacar() {
        System.out.printf("%s dispara una flecha\n",super.nombre);
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "Tipo: Arquero\n"
                + "Precision: " + this.precision+"\n";
    }
}
