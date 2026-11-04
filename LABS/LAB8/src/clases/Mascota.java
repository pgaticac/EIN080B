package clases;


public class Mascota {
    private String nombre;
    private int alimentacion;
    private int energia;
    private int felicidad;

    public Mascota() {
    }

    public Mascota(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
        this.alimentacion = 60;
        this.energia = 70;
        this.felicidad = 75;
    }

    public String getNombre() { return nombre; }
    public int getAlimentacion() { return alimentacion; }
    public int getEnergia() { return energia; }
    public int getFelicidad() { return felicidad; }

    public void alimentar() {
        alimentacion = limitar(alimentacion + 20);
    }

    public void jugar() {
        if (energia < 20) {
            throw new IllegalStateException(nombre + " necesita descansar antes de jugar.");
        }
        energia = limitar(energia - 20);
        alimentacion = limitar(alimentacion - 15);
        felicidad = limitar(felicidad + 20);
    }

    public void descansar() {
        energia = limitar(energia + 30);
        alimentacion = limitar(alimentacion - 10);
    }

    private int limitar(int valor) {
        return Math.max(0, Math.min(100, valor));
    }

    @Override
    public String toString() {
        return String.format("%s | Alimentación: %d | Energía: %d | Felicidad: %d",
                nombre, alimentacion, energia, felicidad);
    }
}
