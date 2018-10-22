
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio19 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //mal
        
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        
        int contador = 0;
        int nroImpar = 1;
        int resultado = 0;
        
        while (contador < nro){
        
            resultado = resultado + nroImpar;
            
            nroImpar = nroImpar +2;
            
            contador ++;
        
        }
        
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
}
