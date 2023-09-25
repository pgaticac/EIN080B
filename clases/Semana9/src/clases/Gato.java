package clases;


public class Gato extends Animal {
    
    private int vidas;
    
    public Gato(){
        this.vidas = 7;
    }
    
    
    //Sobreescritura (Misma firma, distinto cuerpo)
    @Override
    public String comunicarse() {
        return "miau!"; 
    }

    @Override
    public String toString() {
        return "Gato{nombre="+ super.getNombre() +  ", edad= " + super.edad + ", vidas=" + vidas + '}';
    }
    
    
  
}
