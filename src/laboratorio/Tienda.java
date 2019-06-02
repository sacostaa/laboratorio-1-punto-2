
package laboratorio;

import java.util.*;
public class Tienda {
    private ArrayList <Producto> productos;
    private Vendedor [] vendedores;
    private ArrayList <Venta> ventas;
    private ArrayList <Proveedor> proveedores;
    private int deudas;
    private int ganacias;

    public Tienda( ) {
        this.productos = new ArrayList <Producto> ();
        this.vendedores = new Vendedor[7] ;
        this.ventas = new ArrayList<Venta>();
        this.proveedores = new ArrayList <Proveedor> ();
    }

    public int getDeudas() {
        return deudas;
    }

    public void setDeudas(int deudas) {
        this.deudas = deudas;
    }

    public int getGanacias() {
        return ganacias;
    }

    public void setGanacias(int ganacias) {
        this.ganacias = ganacias;
    }
    

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Vendedor[] getVendedores() {
        return vendedores ;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
    
    public boolean añadirproveedores(Proveedor proveedor){
        this.proveedores.add(proveedor);
        return true;
    }
    
    public boolean añadirvendedores(int codigo, String nombre){
        
        for (int i = 0; i < vendedores.length; i++) {
            
            
            vendedores [i] = new Vendedor(codigo,nombre);
            }
        
        return true;
    }
    
    public boolean añadirproductos(String nombrep, int cantidadp){
        int deuda;
        deuda = 0;
        
            for (int j = 0; j < proveedores.size(); j++) {
                for (int k = 0; k < proveedores.get(j).getProductos().size(); k++) {
                    
                
                if(nombrep.equals(proveedores.get(j).getProductos().get(k).getNombre())){
                  productos.add(new Producto(proveedores.get(j).getProductos().get(k).getNombre(),proveedores.get(j).getProductos().get(k).getPrecio(),proveedores.get(j).getProductos().get(k).getCodigo(),cantidadp));
                  deuda = deuda + (proveedores.get(j).getProductos().get(k).getPrecio() * cantidadp);
                  proveedores.get(j).getProductos().get(k).setDeuda(deuda);
                
            }
            
        }
            
    }
        return true;
    }
    
    public boolean generarventa(int la,int codigop, int codigov,int numerop, int dia, int mes,int año){
        int preciofinal;
        int cantidadfinal;
        cantidadfinal = 0;
        preciofinal = 0;
        
         ventas.add(new Venta());
        
    
        
            
             
     
            
            ventas.get(la).getFecha().setDate(dia);
            ventas.get(la).getFecha().setMonth(mes);
            ventas.get(la).getFecha().setYear(año);
        if(numerop > 1){
            
            for (int k = 0; k < numerop; k++) {
                
            
        for (int j = 0; j < productos.size(); j++) {
            if(productos.get(j).getCodigo() == codigop){
                ventas.get(la).getProductos().add(productos.get(j));
                
            }     
                    
                }
            }     
                        }else{
            for (int j = 0; j < productos.size(); j++) {
            if(productos.get(j).getCodigo() == codigop){
                ventas.get(la).getProductos().add(productos.get(j));
            }
            }
        }
        
        for (int m = 0; m < vendedores.length; m++) {
            if(vendedores[m].getId() == codigov){
                ventas.get(la).setVendedor(vendedores[m]);
        }
        }
        
                for (int k = 0; k < ventas.get(la).getProductos().size(); k++) {
                    if(ventas.get(la).getProductos().get(k).getCodigo()==codigop){
                    preciofinal = preciofinal + ventas.get(la).getProductos().get(k).getPrecio();
                    }
                    
                }
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getCodigo() == codigop) {
                        
                    
                    
            cantidadfinal = (numerop - productos.get(i).getCantidad()) * -1;
            productos.get(i).setCantidad(cantidadfinal);
                    }
        }
                
            System.out.println("nueva factura");
            System.out.println("nombre producto");
            System.out.println(ventas.get(la).getProductos().get(la).getNombre());
            System.out.println("codigo producto");
            System.out.println(ventas.get(la).getProductos().get(la).getCodigo());
            System.out.println("precio producto");
            System.out.println(ventas.get(la).getProductos().get(la).getPrecio());
            System.out.println("cantidad producto");
            System.out.println(numerop);
                
            System.out.println("precio final");
            System.out.println(preciofinal);
            ventas.get(la).setGanancia(preciofinal + 300);
            
        
            return true;
            
        
       
        
       
    }
    
    public void escasesproductos(){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCantidad() < 5 && 0 < productos.get(i).getCantidad()) {
                System.out.println(productos.get(i).getNombre());
                System.out.println("producto escaso");
                
            }else{
                System.out.println("no hay productos escasos"); 
            }
        }
    }
    
    
    public void productosagotados(){
        for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i).getCantidad() <= 0){
               System.out.println(productos.get(i).getNombre());
                System.out.println("producto agotado"); 
            }
            
        }
    }
    
    public void diferenciaventaaños(int año1,int año2){
        int montoaño1;
        int montoaño2;
        int diferenciademontos;
        montoaño1 = 0;
        montoaño2 = 0;
        for (int i = 0; i < ventas.size(); i++) {
            
            if(ventas.get(i).getFecha().getYear() == año1){
                montoaño1 = montoaño1 + ventas.get(i).getGanancia();
            }
            
            if(ventas.get(i).getFecha().getYear() == año2){
                montoaño2 = montoaño1 + ventas.get(i).getGanancia();
            }
            
        }
        
        System.out.println("ganancias del primer año ingresado");
        System.out.println(montoaño1);
        System.out.println("ganancias del segundo año ingresado");
        System.out.println(montoaño2);
        if(montoaño1 > montoaño2){
            diferenciademontos = montoaño1 - montoaño2;
            System.out.println("se gano mas en el primer año ingresado por:");
        }else{
            diferenciademontos = montoaño2 - montoaño1;
            System.out.println("se gano mas en el segundo año ingresado por:");
        }
        System.out.println(diferenciademontos);
    }
    
    
    public void deudasconproveedores(){
        for (int i = 0; i < proveedores.size(); i++) {
            for (int j = 0; j < proveedores.get(i).getProductos().size(); j++) {
                System.out.println("deuda con");
                System.out.println(proveedores.get(i).getNombre());
                System.out.println("por el monto de");
                System.out.println(proveedores.get(i).getProductos().get(j).getDeuda());
            }
            
        }
    }
    
    
    
    
    
    }  


    
