package t8p4ej1;

import GUI.*;
import UML.*;
import java.util.ArrayList;
public class T8p4ej1 {

    static LogIn Li;
    static VentanaPrincipal Vp;
    private static ArrayList<Personal> listaPersonal;
    private static Personal p;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Li = new LogIn();
        Li.setVisible(true);
        
        añadirLogIn();
        
    }
    
    public static void añadirLogIn(){
    
        listaPersonal = new ArrayList<Personal>();
        p = new Personal ("admin","admin");
        listaPersonal.add(p);
    
    }
    
    public static void comprobarLogin(){
    
       Li.dispose();
       
       Vp = new VentanaPrincipal();
       Vp.setVisible(true);
       
       
        
    }
    
}
