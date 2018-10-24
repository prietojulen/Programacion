package cap3ej03;

import javax.swing.JOptionPane;

public class Cap3Ej03 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        char caracter = JOptionPane.showInputDialog("Teclea el caracter").charAt(0);;
        
        int veces = buscar(cadena, caracter);
        
    }
    
    public static void buscar(String cadena, char c){
        int contador = 0;
        for(int y = 0; y > cadena.length(); y++)
            if (cadena.charAt(y) ==c)
                  contador++;
        return contador;
        
  
    }
    
}
