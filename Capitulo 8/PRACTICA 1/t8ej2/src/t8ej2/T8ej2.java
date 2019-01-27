package t8ej2;

import MisClases.Personas;

public class T8ej2 {
    
    public static void main(String[] args) {
        // TODO code application logic here

        ventana v = new ventana();  
        v.setVisible(true);
        
        Personas p1 = new Personas();
        
    }
    
    public static void salir(){
        System.exit(0); 
    }
    
    public static void nombre(){
    
       String nombre = tfNombre.getText();
    
    }
    public static void apellidos(){
    
        String apellidos = tfApellidos.getText();
    }
    
    public static void dni(){
        String dni = tfDni.getText();
    }
    
    public static void bAceptar(){
        
    }
    
}
