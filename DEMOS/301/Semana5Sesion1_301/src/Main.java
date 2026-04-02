
import clases.Empleado;


public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();
      
        e1.setNombre("Pedro");
        e1.setSueldo(200000);
        e1.setDepartamento("Ventas");
        
        e2.setNombre("Juan");
        e2.setSueldo(350000);
        e2.setDepartamento("Mantención");
        
        System.out.println(e1.getBono());
        System.out.println(e2.getBono());
        
    }
    
}
