package clases;

public class Persona {

    //Caracteristicas (Atributos)
    private String nombre;
    private String apellido;
    private String telefono;

    //Constructor
    public Persona() {
        this.nombre = "N";
        this.apellido = "N";
    }

    public Persona(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //Accesadores y Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Métodos
    public String saludar() {
        return "Hola, soy " + this.nombre + " " + this.apellido;
    }

}
