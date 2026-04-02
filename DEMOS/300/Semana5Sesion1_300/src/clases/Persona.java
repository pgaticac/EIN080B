
package clases;

public class Persona {
    private String nombre;
    private String apellido;
    private String colorPelo;
    
   
    
    
    public String saludar(){
        return "Hola soy " + this.nombre + " " + this.apellido;
    }

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

    public String getColorPelo() {
        return colorPelo;
    }

//    public void setColorPelo(String colorPelo) {
//        if (colorPelo != "Verde") {
//            this.colorPelo = colorPelo;
//        }
//        
//    }
}//end class Persona


