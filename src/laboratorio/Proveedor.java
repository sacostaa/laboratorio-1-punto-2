package laboratorio;
import java.util.*;
public class Proveedor {
    
    private String nombre;
    private ArrayList < Producto> productos;

    public Proveedor(String nombre ) {
        this.nombre = nombre;
        this.productos = new ArrayList<Producto>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    public boolean añadirproducto(Producto producto){
        
        this.productos.add(producto);
        return true;
    }
    
    
    public boolean crearproducto(String nombre, int precio, int codigo, int cantidad){
        this.productos.add(new Producto(nombre,precio,codigo, cantidad));
        return true;
    }
}
