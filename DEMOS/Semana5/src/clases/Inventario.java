
package clases;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }
    
    
    
    public void agregar(Producto nuevo){
        //validaciones antes de agregar
        //verificar que el codigo del producto no exista
        if(this.buscar(nuevo.getCodigo())==null){
            productos.add(nuevo);
        }
    }
    
    public Producto buscar(String codigo){
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
}
