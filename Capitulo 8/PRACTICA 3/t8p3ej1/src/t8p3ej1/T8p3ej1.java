
package t8p3ej1;

import UML.Producto;
import Vista.*;
import java.util.ArrayList;
public class T8p3ej1 {

    static VentanaPrincipal vp;
    static VentanaFinal vf;
    
    private static ArrayList<Producto> listaProductos;
    private static Producto p;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        vp = new VentanaPrincipal();
        vp.setVisible(true);
        generarProductos();
         
    }
    
    public static void generarProductos(){
        
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("Agua",100,0.50);
        listaProductos.add(p);

         listaProductos = new ArrayList<Producto>();
        p = new Producto ("Cerveza",200,1.50);
        listaProductos.add(p);
    
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("CocaCola",50,1.00);
        listaProductos.add(p);
        
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("Vino",30,14.99);
        listaProductos.add(p);
        
        listaProductos = new ArrayList<Producto>();
        p = new Producto ("Kas",300,0.75);
        listaProductos.add(p);
    }
    
    public static void cambiarVentana(){
    
        vp.setVisible(false);
        vf = new VentanaFinal();
        vf.setVisible(true);
    }
    
    public static void limpiarVentana(){

        vf.setVisible(false);
        vp.dispose();
        
        vp.setVisible(true);
    }
    
    public static boolean validarProducto(String nombre){
        
        int x;
        for(x=0;x < listaProductos.size() && listaProductos.get(x).getNombre().compareToIgnoreCase(nombre) !=0; x++){}
        if (x == listaProductos.size()){
            return false;
        }
        p= listaProductos.get(x);
        
        return true;
    }
    
}
