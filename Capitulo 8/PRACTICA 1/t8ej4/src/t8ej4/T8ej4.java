
package t8ej4;

import UML.Producto;
import java.util.ArrayList;
import Ventana.*;


public class T8ej4 {

    static ArrayList<Producto> listaproducto = new ArrayList();
    static VentanaPrincipal vPrincipal;
    static VentanaVentas vVentas;
    static VentanaCompras vCompras;

    public static void main(String[] args) {
        // TODO code application logic here
        
        vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);
         
        
    }
    
    public static Producto insertarProductos(int codigo, String nombre, String descripcion, double precio, int unidades){
    
        Producto p1 = new Producto();
   
        p1.setCodigo(0001);
        p1.setNombre("Monitor Asus");
        p1.setDescripcion("Monitos FullHD");
        p1.setPrecio(299.99);
        p1.setUnidades(100);
       
        Producto p2 = new Producto();
        
        p2.setCodigo(0002);
        p2.setNombre("Raton MarsGaming");
        p2.setDescripcion("Raton Gaming con luces LED");
        p2.setPrecio(49.99);
        p2.setUnidades(50);
        
        Producto p3 = new Producto();
        
        p3.setCodigo(0003);
        p3.setNombre("Teclado Trust");
        p3.setDescripcion("Teclado mecanido");
        p3.setPrecio(25.00);
        p3.setUnidades(85);
        
        return p1;
        
    }
    
    
}
