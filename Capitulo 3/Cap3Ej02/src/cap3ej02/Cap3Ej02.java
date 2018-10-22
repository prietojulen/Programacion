package cap3ej02;

import javax.swing.JOptionPane;

public class Cap3Ej02 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase = (JOptionPane.showInputDialog("Introduce una frase, yo la volteo "));
        String fraseInvertida = " ";
        
        
            //La idea es muy simple. Iremos recorriendo la cadena,
            //carácter a carácter, desde el último carácter hasta el primero.
            //Para ello nos apoyamos en un bucle for.
            for (int x=frase.length()-1;x>=0;x--)
    		fraseInvertida = fraseInvertida + frase.charAt(x);
            
            JOptionPane.showMessageDialog(null, fraseInvertida);
        
    }
    
}
