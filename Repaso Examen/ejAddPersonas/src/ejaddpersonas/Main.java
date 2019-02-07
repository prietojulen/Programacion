package ejaddpersonas;

import GUI.*;
import UML.Persona;
import java.util.ArrayList;

public class Main {
    
    private static VentanaPrincipal Vp;
    private static VentanaListado Vl;
    private static ArrayList<Persona> listaPersonas = new  ArrayList<Persona>();
    Persona p = new Persona();

    public static void main(String[] args) {
        // TODO
        //Añado una persona para que el ejercicio no esté vacio
        addPrimeraPersona();
        //Muestro la ventana principal
        MostrarVentanaPrincipal();
        
    }
    
    public static void MostrarVentanaPrincipal(){
    
        Vp = new VentanaPrincipal();
        Vp.setVisible(true);
   
    }
    public static void addPrimeraPersona(){
        Persona p1 = new Persona("Peto","Xyt","11111111a");
        listaPersonas.add(p1);
    }
    
    public static boolean addPersona(String nombre,String apellidos, String dni){
    
        Persona p2 = new Persona(nombre,apellidos,dni);
        listaPersonas.add(p2);
        
        System.out.println(p2);
        
        return true;
    }
     public static String listarUsuarios(){
        
        int x;
        String list ="";
        for(x = 0;x < listaPersonas.size(); x++){
        
            list += "Nombre: " +listaPersonas.get(x).getNombre() +
                    "Apellidos: " + listaPersonas.get(x).getApellidos() +
                    "Dni: " + listaPersonas.get(x).getDni() + "\n";
        }
        return list;

    }   
    
    public static void mostrarListado(){
        
        Vp.dispose();
        
        Vl = new VentanaListado(listarUsuarios());
        Vl.setVisible(true);
        
    }
    
    public static void finalizar(){
        System.exit(0);
    }
    
}
