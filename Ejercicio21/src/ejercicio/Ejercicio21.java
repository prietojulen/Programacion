
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio21 {


    public static void main(String[] args) {
        // Es el numero primo?
        
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        int divisor = nro;
        double resto;
        
        do
        {
          divisor = divisor -1;
          resto = nro % divisor;
        
        }
        while(resto !=0 && divisor > 2);
        
            if(resto == 0)
            {
                JOptionPane.showMessageDialog(null, "El numero tecleado NO es PRIMO");
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El numero tecleado ES PRIMO");

            }
       
        
    }
    
}
