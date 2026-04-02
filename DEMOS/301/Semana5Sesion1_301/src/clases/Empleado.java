package clases;

public class Empleado {

    private String nombre;
    private String rut;
    private String departamento;
    private int sueldo;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRut() {
        return rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;            
        }
        
    }
    
    public int getBono(){
        if (this.departamento == "Ventas") {
            return this.sueldo*50/100;
        }
        if (this.departamento == "Mantención") {
            return this.sueldo*10/100;
        }
        return 0;
    }
    
}
