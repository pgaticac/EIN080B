package clases;

public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private Dueño dueño;

    public Vehiculo() {
        this.patente = "Sin Patente";
        this.marca = "Sin Marca";
        this.modelo = "Sin Modelo";
    }

    public Vehiculo(String marca, String modelo,String patente) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
    
    
    public String getPatente(){
        return this.patente;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " patente: "    + this.patente +". Dueño: " + this.dueño;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    
    
}
