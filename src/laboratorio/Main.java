/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        
        Tienda t1 = new Tienda();
        Proveedor p1 = new Proveedor("bimbo");
        Proveedor p2 = new Proveedor("margarita");
        p1.crearproducto("pan", 3000, 1, 1000);
        p2.crearproducto("papas de limon", 1200, 2, 1000);
        
        
        t1.añadirproveedores(p1);
        t1.añadirproveedores(p2);
        
        Scanner h = new Scanner(System.in);
            System.out.println("cuantos vendedores quiere crear");
            int nvv;
            nvv= h.nextInt();
            for (int i = 0; i <nvv ; i++) {
                Scanner j = new Scanner(System.in);
            System.out.println("cual es el codigo del vendedor");
            int cv;
            cv= j.nextInt();
            Scanner k = new Scanner(System.in);
            System.out.println("cuantos vendedores quiere crear");
            String nov;
            nov= k.nextLine();
                
            t1.añadirvendedores(cv, nov);
        }
            
            Scanner l = new Scanner(System.in);
            System.out.println("cuantos productos quiere ingresar");
            int nump;
            nump= l.nextInt();
            
            for (int i = 0; i < nump; i++) {
                Scanner m = new Scanner(System.in);
            System.out.println("cual es el nombre del producto");
            String nomp;
            nomp= l.nextLine();
            Scanner n = new Scanner(System.in);
            System.out.println("cuantas unidades del producto elegido desea ingresar");
            int canp;
            canp= n.nextInt();
                
            t1.añadirproductos(nomp, canp);
        }
        
        
        
        
        Scanner a = new Scanner(System.in);
        System.out.println("cuantas ventas quiere hacer?");
        int nv;
        int nnv = 0;
        nv= a.nextInt();
        for (int i = 0; i < nv; i++) {
            Scanner b = new Scanner(System.in);
            System.out.println("cual es el codigo de el producto");
            int cp;
            cp= b.nextInt();
            Scanner c = new Scanner(System.in);
            System.out.println("cual es el codigo de el vendedor");
            int cv;
            cv= c.nextInt();
            Scanner d = new Scanner(System.in);
            System.out.println("cuantos productos va a ingresar");
            int cap;
            cap= d.nextInt();
            Scanner e = new Scanner(System.in);
            System.out.println("cual es el dia");
            int dia;
            dia= e.nextInt();
            Scanner f = new Scanner(System.in);
            System.out.println("cual es el mes");
            int mes;
            mes= f.nextInt();
            Scanner g = new Scanner(System.in);
            System.out.println("cual es el año");
            int año;
            año= g.nextInt();
            
            
            
            System.out.println(t1.generarventa(nnv, cp,cv,cap,dia,mes,año));
            nnv++;
        }
        
        
        Scanner ñ = new Scanner(System.in);
            System.out.println("si quiere saber la deuda con los proveedores ingrese 1 si no ingrese cualquier otro numero");
            int v1;
            v1= ñ.nextInt();
            if (v1 == 1) {
            t1.deudasconproveedores();
        }
            Scanner lo = new Scanner(System.in);
            System.out.println("si quiere saber la escases de productos ingrese 1 si no ingrese cualquier otro numero");
            int v2;
            v2= lo.nextInt();
            if (v2 == 1) {
             t1.escasesproductos();
        }
        Scanner la = new Scanner(System.in);
            System.out.println("si quiere saber la diferencia de ganancoias entre dos años ingrese 1 si no ingrese cualquier otro numero");
            int v3;
            v3= la.nextInt();
            if (v3 == 1) {
                Scanner le = new Scanner(System.in);
            System.out.println("ingrese el año 1");
            int a1;
            a1= le.nextInt();
            Scanner li = new Scanner(System.in);
            System.out.println("ingrese el año 1");
            int a2;
            a2= li.nextInt();
                
             t1.diferenciaventaaños(a1, a2);
        }
         
        
        
        
        
        
        
    }
    }
