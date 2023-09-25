
package clases;


public class Pasajero {
    //atributos (caracteristicas) - variables
    private String rut;
    private String nombre;
    private int edad;
    private int telefono;
    //constructores -
    
    public Pasajero(){
        
    }
    
    public Pasajero(String rut, String nombre, int edad, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    //accesadores y mutadores
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //métodos
    public String imprimir(){
        return this.nombre + " " + this.edad;
    }

    @Override
    public String toString() {
        return "Pasajero{nombre=" + nombre +'}';
    }
    
    
}
