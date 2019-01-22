package repasotema8ejercicio2;

import UML.Persona;
import Vista.*;
import java.util.ArrayList;


public class RepasoTema8Ejercicio2 {

    static ArrayList<Persona> listaPersonas = new ArrayList();
    static VentanaInput v1;
    static VentanaOutput v2;
  
    public static void main(String[] args) {
        // TODO code application logic here
        v1 = new VentanaInput();
        v1.setVisible(true);
                
    }
    
    public static boolean comprobar(String nombre,String apellidos, String dni){
        
        if(listaPersonas.size() < 1){
            Persona p1 = generarPersona(nombre, apellidos, dni);
            listaPersonas.add(p1);
            
            //Devuelvo false para indicar que la persona no existia
            return false;
        }else{
            boolean existe = false;
            for(int x=0;x < listaPersonas.size() && !existe; x++){
                 existe = listaPersonas.get(x).getDni().equalsIgnoreCase(dni);
            }
            if(!existe){
                Persona p1 = generarPersona(nombre, apellidos, dni);
                listaPersonas.add(p1);
            }
            return existe;
        }
    }
    
    public static Persona generarPersona(String nombre,String apellidos, String dni){
    
        Persona p1 = new Persona();
        
        p1.setNombre(nombre);
        p1.setApellidos(apellidos);
        p1.setDni(dni);
        
        return p1;
    }
    
    public static void mostrarListado(){
    
        v1.dispose();
        VentanaOutput v2 = new VentanaOutput();
        
        v2.setVisible(true);
    }
    
    public static ArrayList<Persona> listarPersonas(){
        return listaPersonas;
    }
    
    public static void finalizar(){
        
        System.exit(0);
    
    }
    
}
