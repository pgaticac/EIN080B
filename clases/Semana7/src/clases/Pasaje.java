
package clases;


public class Pasaje {
    private int numeroAsiento;
    private String tipoServicio;
    private Pasajero pasajero;

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "numeroAsiento=" + numeroAsiento + ", tipoServicio=" + tipoServicio + ", pasajero=" + pasajero + '}';
    }
    
    
    
}
