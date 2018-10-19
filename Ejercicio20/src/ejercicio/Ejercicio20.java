package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //pongo el 102 porque no puedo meter un "fin" en un int
        
        //double para no perder precision
        // variable = Math.random() *"numero limite +1"
        double nroGenerado = Math.random() *101;
        System.out.println(nroGenerado);
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        
        while (nro != 102){
        
            if (nro != nroGenerado){
                if (nro < nroGenerado){
                    JOptionPane.showMessageDialog(null,"Inténtalo con un numero más PEQUEÑO");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Inténtalo con un numero más GRANDE");
                    }
            }
            else{
                    JOptionPane.showMessageDialog(null, "¡ENHORABUENA!");
                    nro = 102;
            
            }
        
        
        }
        
        
        
        
        
        
    }
    
}
