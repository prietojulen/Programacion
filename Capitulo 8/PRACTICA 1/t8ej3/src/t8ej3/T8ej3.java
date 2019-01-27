package t8ej3;

import UML.Persona;
import java.util.ArrayList;
import vista.VentanaInsercion;

public class T8ej3 {
    
    private static ArrayList<Persona> listaPersonas; 
    private static VentanaInsercion vi;

    public static void main(String[] args) {
        // Simulación de la base de datos
        listaPersonas = new ArrayList<Persona>();
        
        vi = new VentanaInsercion();
        vi.setVisible(true);
         
    }
    public static void terminar(){
        // Eliminar la ventana
        vi.dispose();
        System.exit(0);
    }
    
}
