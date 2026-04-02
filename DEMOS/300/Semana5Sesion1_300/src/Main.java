
import clases.Persona;

public class Main {

    public static void main(String[] args) {
        //Crear objetos de una clase
        Persona p1 = new Persona();
//       p1.nombre = "Juan Pablo";
//       p1.apellido = "Rodriguez";
//       p1.colorPelo = "Castaño";

        p1.setNombre("Juan Pablo");
        p1.setApellido("Rodriguez");
//        p1.setColorPelo("Verde");

        System.out.println(p1.saludar());
        System.out.println(p1.getColorPelo());
    }

}
