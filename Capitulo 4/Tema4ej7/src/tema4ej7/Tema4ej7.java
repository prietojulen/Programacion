
package tema4ej7;

import javax.swing.JOptionPane;


public class Tema4ej7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int arrayCod[] = {
            10,23,30,47,55,65,135,256,526,663
        };
       /* 
        int arrayCodCant[][];
        
            arrayCodCant[0][0] = 10;
            arrayCodCant[1][0] = 23; 
            arrayCodCant[2][0] = 30; 
            arrayCodCant[3][0] = 47; 
            arrayCodCant[4][0] = 55; 
            arrayCodCant[5][0] = 65; 
            arrayCodCant[6][0] = 135; 
            arrayCodCant[7][0] = 256; 
            arrayCodCant[8][0] = 526; 
            arrayCodCant[9][0] = 663; 
        */
        
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el producto"));
        boolean encontrado = false;
        
        for(int x=0; x < 10; x++)
        {
            if(codigo == arrayCod[x])
            {
                encontrado = true;
            }
        }
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad")); 
        
            /*
            cantidad = 
            
            */
        
        
    }
    
}
