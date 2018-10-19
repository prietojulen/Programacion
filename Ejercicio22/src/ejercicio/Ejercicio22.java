package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static int nro = 1;
    public static int divisor;
    public static int resto;

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int ultimoNro = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        
        do
        {
            funcionPrimo(divisor, resto);
            nro = nro +1;
        }
        while(nro <= ultimoNro);
                
    }
    
    public static void funcionPrimo(int divisor, int resto){
        //calculamos si el numero es primo o no
        
        if(nro < 4)
        {
        
            JOptionPane.showMessageDialog(null, nro + " PRIMO");
        
        }
        else
        {
        
                divisor = nro;
                
                do
                {
                  divisor = divisor -1;
                  resto = nro % divisor;

                }
                while(resto !=0 && divisor > 2);

                    if(resto != 0)
                    {
                        JOptionPane.showMessageDialog(null, nro + " PRIMO");

                    }
                    else
                    {
                       // JOptionPane.showMessageDialog(null, nro + " no primo");

                    }
        
        
        }
        
    } 
    
    
}
