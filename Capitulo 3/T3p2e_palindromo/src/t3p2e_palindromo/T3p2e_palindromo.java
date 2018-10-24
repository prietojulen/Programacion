
package t3p2e_palindromo;

import javax.swing.JOptionPane;

public class T3p2e_palindromo {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        invertirCadena(cadena);
        
    }
    
    public static void invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder(); 
        
        // Recorrer desdee el final al principio.
        for(int y = cadena.length()-1; y >= 0; y--)
        {
            cadenaInvertida.append(cadena.charAt(y));
            
        }
        
        if(cadena.equals(cadenaInvertida)){
            
            JOptionPane.showMessageDialog(null,"Has tecleado un palindromo!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No es palindromo :( ");
            
        }
        
        
    }
    
}
